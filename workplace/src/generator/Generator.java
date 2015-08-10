package generator;

import java.util.Map;

import generator.sprockellModel.Program;
import generator.sprockellModel.RegisterManager;
import generator.sprockellModel.instructions.Branch;
import generator.sprockellModel.instructions.Compute;
import generator.sprockellModel.instructions.Constant;
import generator.sprockellModel.instructions.Instruction;
import generator.sprockellModel.instructions.Jump;
import generator.sprockellModel.instructions.Nop;
import generator.sprockellModel.instructions.Read;
import generator.sprockellModel.instructions.Receive;
import generator.sprockellModel.instructions.Store;
import generator.sprockellModel.instructions.TestAndSet;
import generator.sprockellModel.instructions.Write;
import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;
import generator.sprockellModel.operands.OpCode;
import generator.sprockellModel.operands.Operator;
import generator.sprockellModel.operands.Register;
import generator.sprockellModel.operands.Target;
import grammar.YallBaseVisitor;
import grammar.YallParser;
import grammar.YallParser.DeclContext;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import checker.IDTable;
import checker.Variable;
import checker.YallChecker;

public class Generator extends YallBaseVisitor<Register>{
	
	private final YallChecker checker;
	private final Program program;
	private final RegisterManager registers = new RegisterManager();

	//Indicates which label should be used for the next fork
	private int nextFork = 1;
	
	//Suffix to make labels unique
	private int labelCount = 1;
	
	
	
	/*
	 * Global Memory allocation. 
	 * ------THREAD FLAGS--------
	 * 0 till (#Forks)	->	One variable for each SPID.
	 * 						(#Forks = #Threads - 1 = lockOffset -1)
	 * 
	 * 		Address 0 is 1 if the INIT has finished(and other threads may start)
	 * 
	 * 		Address x is 0 if SPID x cannot start yet
	 * 		Address x is 1 if SPID x may start (Used for forks)
	 * 		Address x is 2 if SPID x has terminated (Used for joins)
	 * 
	 * -----LOCK FLAGS-----------
	 * 
	 * lockOffset till (lockOffset + (#Locks * 2)) - 1
	 * 					->	Two flags per lock
	 * 						(lockOffset + (#Locks * 2)) = globalVarOffset
	 * 
	 * 		Address lockOffset + (2 * lockInt) = Locked flag
	 * 											0 if lock is free
	 * 											1 if lock is locked
	 * 
	 * 		Address lockOffset + (2 * lockInt) + 1= Locked-By flag
	 * 											0 if lock is free
	 * 											SPID of locker if locked
	 * 
	 * -----GLOBAL MEMORY--------
	 * 
	 * globalVarOffset till ??
	 * 
	 * 		Address globalVarOffset + var.getOffset() = Value of variable
	 * 		
	 */
	private final int lockOffset;
	private final int globalVarOffset;
	
	//Indicates whether the init phase is still generating (and therefor declarations are global)
	private boolean init = false;
	
	//All scopes
	private final Map<ParseTree, IDTable> scopes;
	
	//IDTable of the currently generating scope
	private IDTable idtable;
	private final IDTable globalScope;
	
	
	
	public Generator(YallChecker checker, ParseTree tree){
		this.checker = checker;
		this.scopes = checker.getScopes();
		lockOffset = checker.getThreads().size();
		globalVarOffset = lockOffset + (checker.getLocks().size() * 2);
		program = new Program(checker.getName());
		this.globalScope = checker.getGlobalScope();
	}
	
	
	/*
	 * Standard Registers to use
	 */
	private static Register reg_zero = new Register("Zero");
	private static Register reg_pc = new Register("PC");
	private static Register reg_sp = new Register("SP");
	private static Register reg_spid = new Register("SPID");

	
	@Override public Register visitProgram(@NotNull YallParser.ProgramContext ctx) { 
		//Only do if SPID 0
		if(!checker.getThreads().isEmpty()){
			Register reg1 = registers.getFreeRegister();
			addInstruction(null, new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
			addInstruction(null, new Branch(reg1, new Target(program, new Label("InitWaitLoop"))));
			registers.clearRegister(reg1);
		}
		
		//Thread flags
		for(int i = 0; i < lockOffset; i++){
			addInstruction(new Write(reg_zero, new MemAddr(i)));
		}
		
		//Lock flags
		for(int i = lockOffset; i < globalVarOffset; i++){
			addInstruction(new Write(reg_zero, new MemAddr(i)));
		}
		
		//Global var flags
		if(ctx.init() != null){
			visit(ctx.init());
		}
		
		Register reg1 = registers.getFreeRegister();
		
		//Set initializationDone Flag to 1
		addInstruction(new Constant(1, reg1));
		addInstruction(new Write(reg1, new MemAddr(0)));
		addInstruction(new Jump(new Target(program, new Label("EndOfInit"))));
			
		
		//Wait Loop for SPID != 0
		Register reg2 = registers.getFreeRegister();	//reg1 is still claimed
		addInstruction(new Label("InitWaitLoop"), new Constant(1, reg1));
		addInstruction(new Read(new MemAddr(0)));
		addInstruction(new Receive(reg2));
		addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg2));
		addInstruction(new Branch(reg2, new Target(-3, false)));
		
		registers.clearRegister(reg2);
		
		
		//All threads reach this point simultaneously and therefore start executing the program itself at the same time
		addInstruction(new Label("EndOfInit"), new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
		
		//Fork to next split point, called Fork1. Only SPID0 executes the first toplevelblock
		addInstruction(new Branch(reg1, new Target(program, new Label("Fork1"))));
		nextFork = 2;

		registers.clearRegister(reg1);

		
		
		
		visit(ctx.toplevelblock());
		return null; 
	}
	
	/*
	 * 	------------INIT-----------------------
	 */
	
	@Override public Register visitInit(@NotNull YallParser.InitContext ctx) { 
		idtable = checker.getGlobalScope();
		Register reg1 = registers.getFreeRegister();
		//Only register 0 does the initialization
		addInstruction(new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
		addInstruction(new Branch(reg1, new Target(program, new Label("InitLoop"))));
		init = true;
		registers.clearRegister(reg1);
		for(DeclContext decl : ctx.decl()){
			visit(decl);
		}

		
		init = false;
		idtable = null;
		return null; 
	}

	
	/*
	 * 	------------TOPLEVELBLOCK--------------
	 */
	
	@Override public Integer visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { 	
		
		return visitChildren(ctx); 
	}

	@Override public Integer visitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override public Integer visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override public Integer visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx) { 
		return visitChildren(ctx); 
	}
	/*
	 * 	------------BLOCK---------------------
	 */
	
	/*
	 * 	------------STATEMENT-----------------
	 */
	
	@Override public Register visitStatDeclare(@NotNull YallParser.StatDeclareContext ctx) { 
		visit(ctx.decl());
		return null; 
		}

	@Override public Register visitStatAssign(@NotNull YallParser.StatAssignContext ctx) { 
//		int value = visit(ctx.expr());
		
		Variable localID = idtable.getID(ctx.ID().getText());		
		Register reg1 = visit(ctx.expr());
		
//		addInstruction(new Constant(value, reg1));	
		if(localID != null){
			//ID is found in local scope
			addInstruction(new Store(reg1, new MemAddr(localID.getOffset())));
		} else {
			Variable globalID = globalScope.getID(ctx.ID().getText());
			if(globalID != null){
				//ID is not found locally, but is found in the global Scope
				addInstruction(new Write(reg1, new MemAddr(globalID.getOffset())));
			} else {
				//ID is found neither locally, nor globally
				System.err.println(String.format("Variable %s is not found in IDTable, should have been caught by the checker", ctx.ID().getText()));
			}
		}
		
		//if register1 was A, B, C, D or E, unclaim it
		if(!reg1.equals(reg_zero)){
			registers.clearRegister(reg1);
		}
		
		return null; 
	}
	
	@Override public T visitStatIf(@NotNull YallParser.StatIfContext ctx) { return visitChildren(ctx); }

	@Override public Register visitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		
		Label cond = new Label("WhileCond" + labelCount);
		Label then = new Label("WhileDo" + labelCount);
		Label end = new Label("WhileEnd" + labelCount);
		
		//---While condition
		addInstruction(cond, new Nop());
		Register reg1 = visit(ctx.expr());
		
		//If Expr = 1 (= true) -> Loop
		//if Expr = 0 (= false) -> Break
		addInstruction(new Branch(reg1, new Target(program, then)));
		addInstruction(new Jump(new Target(program, end)));
		if(!reg1.equals(reg_zero)){
			registers.clearRegister(reg1);
		}
				
		
		//---While Then
		addInstruction(then, new Nop());
		visit(ctx.block());
		
		//Go back to evaluate the condition again
		addInstruction(new Jump(new Target(program, cond)));
		
		//---While End
		addInstruction(end, new Nop());
		

		labelCount++;

		return null; 
	}

	@Override public T visitStatInput(@NotNull YallParser.StatInputContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitStatOutputInt(@NotNull YallParser.StatOutputIntContext ctx) { return visitChildren(ctx); }
	
	@Override public Register visitStatLock(@NotNull YallParser.StatLockContext ctx) { 
		
		Register reg1 = registers.getFreeRegister();
		
		//lockAddress = flag isOwned
		//lockAddress = SPID of owner
		int lockAddress = lockOffset + checker.getLocks().get(ctx.ID().getText()).getOffset();
		
		//Try if Lock is free
		addInstruction(new TestAndSet(new MemAddr(lockAddress)));
		addInstruction(new Receive(reg1));
		
		//If lock is in use, try again
		addInstruction(new Branch(reg1, new Target(-2, false)));
		
		//If lock is free, set SPID
		addInstruction(new Write(reg_spid, new MemAddr(lockAddress + 1)));
		
		registers.clearRegister(reg1);
		return null; 
	}

	@Override public Register visitStatUnlock(@NotNull YallParser.StatUnlockContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		Register reg2 = registers.getFreeRegister();
		
		//lockAddress = flag isOwned
		//lockAddress = SPID of owner
		int lockAddress = lockOffset + checker.getLocks().get(ctx.ID().getText()).getOffset();
				
		//Read LockOwner
		addInstruction(new Read(new MemAddr(lockAddress + 1)));
		addInstruction(new Receive(reg1));
		
		//If lock is not owned by this thread, don't take further action
		addInstruction(new Compute(OpCode.NEQUAL, reg_spid, reg1, reg2));
		addInstruction(new Branch(reg2, new Target(2, false)));
		
		//If lock IS owned by this thread, unlock it
		addInstruction(new Write(reg_zero, new MemAddr(lockAddress)));
		

		registers.clearRegister(reg2);
		registers.clearRegister(reg1);	
		return null; 
		}

	
	
	
	
	
	
	/*
	 * 	------------DECLARATION---------------
	 */
	@Override public Register visitDeclDecl(@NotNull YallParser.DeclDeclContext ctx) { 
		//Variables only declared, not set, so value is reg_zero( either false or 0)
		if(init){
			//Init part is still being declared, so write to global memory
			MemAddr addr = new MemAddr(globalVarOffset + globalScope.getID(ctx.ID().getText()).getOffset());
			addInstruction(new Write(reg_zero, addr));
		}else{
			MemAddr addr = new MemAddr(idtable.getID(ctx.ID().getText()).getOffset());
			addInstruction(new Store(reg_zero, addr));
		}
		return null;
	}

	
	@Override public Register visitDeclAssign(@NotNull YallParser.DeclAssignContext ctx) { 
		//Variables only declared and set, use reg to decide what that is
		Register reg1 = visit(ctx.expr());
	
		//idTable is either the global table during the init, or the local one otherwise. As it are declarations, no double checks are needed
		if(init){
			//Init part is still being declared, so write to global memory
			MemAddr addr = new MemAddr(globalVarOffset + globalScope.getID(ctx.ID().getText()).getOffset());
			addInstruction(new Write(reg1, addr));
		}else{
			MemAddr addr = new MemAddr(idtable.getID(ctx.ID().getText()).getOffset());
			addInstruction(new Store(reg1, addr));
		}
		
		//if register1 was A, B, C, D or E, unclaim it
		if(!reg1.equals(reg_zero)){
			registers.clearRegister(reg1);
		}
				
		return null;
	}

	
	/*
	 * 	------------EXPRESSION----------------
	 * Expressions give back a register with their value inside it
	 */
	
	/*
	 * 	------------OTHER---------------------
	 */
	
	@Override public Register visitBoolTrue(@NotNull YallParser.BoolTrueContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		addInstruction(new Constant(1, reg1));	

		return reg1; 
	}
	
	@Override public Register visitBoolFalse(@NotNull YallParser.BoolFalseContext ctx) { 
		return reg_zero;
	}


	
	
	
	
	public void addInstruction(Instruction i){
		program.addInstruction(i);
	}
	
	public void addInstruction(Label l, Instruction i){
		program.addInstruction(l, i);
	}
	
	public Program getProgram(){
		return program;
	}


}
