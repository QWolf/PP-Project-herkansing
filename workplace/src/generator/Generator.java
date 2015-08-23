package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import generator.sprockellModel.Program;
import generator.sprockellModel.RegisterManager;
import generator.sprockellModel.instructions.Branch;
import generator.sprockellModel.instructions.Compute;
import generator.sprockellModel.instructions.Constant;
import generator.sprockellModel.instructions.EndProg;
import generator.sprockellModel.instructions.Instruction;
import generator.sprockellModel.instructions.Jump;
import generator.sprockellModel.instructions.Load;
import generator.sprockellModel.instructions.Nop;
import generator.sprockellModel.instructions.Read;
import generator.sprockellModel.instructions.Receive;
import generator.sprockellModel.instructions.Store;
import generator.sprockellModel.instructions.TestAndSet;
import generator.sprockellModel.instructions.Write;
import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;
import generator.sprockellModel.operands.OpCode;
import generator.sprockellModel.operands.Register;
import generator.sprockellModel.operands.Target;
import grammar.YallBaseVisitor;
import grammar.YallParser;
import grammar.YallParser.BoolParantesesContext;
import grammar.YallParser.DeclContext;
import grammar.YallParser.StatContext;
import grammar.YallParser.ToplevelblockPartContext;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import checker.IDTable;
import checker.Variable;
import checker.YallChecker;

public class Generator extends YallBaseVisitor<Register>{
	
	private final YallChecker checker;
	private final Program program;
	private final RegisterManager registers = new RegisterManager();
	
	private final MemAddr stdio = new MemAddr(0x1000000);
	private final List<String> errors;


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
		program = new Program(checker.getName(), checker.getThreads().size() + 1);
		this.globalScope = checker.getGlobalScope();
		this.errors = new ArrayList<String>();
	}
	
	
	/*
	 * Standard Registers to use
	 */
	private static Register reg_zero = new Register("Zero");
	private static Register reg_pc = new Register("PC");
	private static Register reg_sp = new Register("SP");
	private static Register reg_spid = new Register("SPID");

	
	@Override public Register visitProgram(@NotNull YallParser.ProgramContext ctx) { 
		
		/*
		 * All SPIDS
		 */
		
		
		//Only do if SPID 0
		if(!checker.getThreads().isEmpty()){
			Register reg1 = registers.getFreeRegister();
			addInstruction(null, new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
			addInstruction(null, new Branch(reg1, new Target(program, new Label("InitWaitLoop"))));
			registers.clearRegister(reg1);
		}
		
		/*
		 * All SPIDS to InitWaitLoop
		 * SPID 0 still here
		 */
		
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
		
		if(!checker.getThreads().isEmpty()){
			//Set initializationDone Flag to 1
			addInstruction(new Constant(1, reg1));
			addInstruction(new Write(reg1, new MemAddr(0)));
			addInstruction(new Jump(new Target(program, new Label("EndOfInit"))));
		
		
			/*
			 * SPID 0 Jumps to label EndOfInit
			 * All SPIDs except SPID 0 are here
			 */
			
			
			//Wait Loop for SPID != 0
			Register reg2 = registers.getFreeRegister();	
			addInstruction(new Label("InitWaitLoop"), new Constant(1, reg1));
			addInstruction(new Read(new MemAddr(0)));
			addInstruction(new Receive(reg2));
			addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg2));
			addInstruction(new Branch(reg2, new Target(-3, false)));
		
			registers.clearRegister(reg2);
		
		
			/*
			 * ALL SPIDS are here
			 */
			
			//All threads reach this point simultaneously and therefore start executing the program itself at the same time
			addInstruction(new Label("EndOfInit"), new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
		
			//Fork to next split point, called Fork1. Only SPID0 executes the first toplevelblock
			addInstruction(new Branch(reg1, new Target(program, new Label("Fork1"))));
			nextFork = 2;
			
			/*
			 * Only SPID 0 remains
			 */
		}
				
		registers.clearRegister(reg1);
		
		visit(ctx.toplevelblock());
		
		
		//DummyRead to ensure Writes have been completed
//		addInstruction(new Read(new MemAddr(0)));
//		addInstruction(new Receive(reg1));
		addInstruction(new EndProg());
		
		return null; 
	}
	
	/*
	 * 	------------INIT-----------------------
	 */
	
	@Override public Register visitInit(@NotNull YallParser.InitContext ctx) { 
		
		/*
		 * Only SPID 0 can reach this code
		 */
		
		idtable = checker.getGlobalScope();
		init = true;
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
	
	@Override public Register visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { 	
		IDTable oldScope = idtable;
		idtable = scopes.get(ctx);
		for(ToplevelblockPartContext tlbp : ctx.toplevelblockPart()){
			visit(tlbp);
		}
		
		idtable = oldScope;
		return null; 
	}

	@Override public Register visitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx) { 
		visit(ctx.stat());
		return null; 
	}

	@Override public Register visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		Register reg2 = registers.getFreeRegister();
		int threadID = checker.getThreads().get(ctx.ID().getText());
		
		Label fork = new Label("Fork" + threadID);
		Label forkParent = new Label("ForkParent" + threadID);
		Label nxtFork = new Label("Fork" + nextFork);
		nextFork++;
		
		//Allow the thread to start
		addInstruction(new Constant(1, reg1));
		addInstruction(new Write(reg1, new MemAddr(threadID)));
		
		//Let the Splitter(Thread that starts the Fork) skip to the end of the Fork-program
		addInstruction(new Jump(new Target(program, forkParent)));
		
		/*
		 * Splitter jumped
		 * Arrival of other Threads
		 */
		
		
		
		//Only do test if there should pass more SPIDs
		
		if(nextFork < checker.getThreads().size() + 1){
			//If SPID =/= Thread ID, go to next fork
			addInstruction(fork, new Constant(threadID, reg1));
			addInstruction(new Compute(OpCode.NEQUAL, reg1, reg_spid, reg2));
			addInstruction(new Branch(reg2, new Target(program, nxtFork)));
			
			/*
			 * Threads jumped
			 * Fork remains
			 */
			//Wait for ThreadMayStart flag to be 1
			addInstruction(new Constant(1, reg1));
			
		} else {
			/*
			 * Threads jumped
			 * Fork remains
			 */
			//Wait for ThreadMayStart flag to be 1
			addInstruction(fork, new Constant(1, reg1));
		}
	
		//Read ThreadMayStart flag
		addInstruction(new Read(new MemAddr(threadID)));
		addInstruction(new Receive(reg2));
		
		//If ThreadMayStart != 1, read again
		addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg2));
		addInstruction(new Branch(reg2, new Target(-3, false)));
		
		registers.clearRegister(reg1);
		registers.clearRegister(reg2);
		
		visit(ctx.toplevelblock());
		
		reg1 = registers.getFreeRegister();
		
		addInstruction(new Constant(2, reg1));
		addInstruction(new Write(reg1, new MemAddr(threadID)));
		
		//DummyRead to ensure Write has been completed
		addInstruction(new Read(new MemAddr(0)));
		addInstruction(new Receive(reg1));

		addInstruction(new EndProg());
		
		/*
		 * End of Fork X,
		 * 
		 * Return of Splitter
		 */
		
		addInstruction(forkParent, new Nop());
		
		return null; 
	}

	@Override public Register visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx) { 
		
		Register reg1 = registers.getFreeRegister();
		Register reg2 = registers.getFreeRegister();
		Register reg3 = registers.getFreeRegister();
		int threadID = checker.getThreads().get(ctx.ID().getText());
		
		addInstruction(new Constant(2, reg2));
		
		//Get HasEnded flag
		addInstruction(new Read(new MemAddr(threadID)));
		addInstruction(new Receive(reg1));
		
		//If HasEnded is not true, retry
		addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg3));
		addInstruction(new Branch(reg3, new Target(-3, false)));
				
		registers.clearRegister(reg1);
		registers.clearRegister(reg2);
		registers.clearRegister(reg3);
		return null; 
	}
	
	/*
	 * 	------------BLOCK---------------------
	 */
	
	@Override public Register visitBlockStatement(@NotNull YallParser.BlockStatementContext ctx) { 
		IDTable oldScope = idtable;
		idtable = scopes.get(ctx);
		for(StatContext stat : ctx.stat()){
			visit(stat);
		}
	
		idtable = oldScope;
		return null; 
	}
	
	
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
				addInstruction(new Write(reg1, new MemAddr(globalVarOffset + globalID.getOffset())));
			} else {
				//ID is found neither locally, nor globally
				addError(ctx.start.getLine(), String.format("Variable %s is not found in IDTable, should have been caught by the checker", ctx.ID().getText()));
			}
		}
	
			registers.clearRegister(reg1);

		
		return null; 
	}
	
	@Override public Register visitStatIf(@NotNull YallParser.StatIfContext ctx) { 
		Label elsE = new Label("IfElse" + labelCount);
		Label ifEnd = new Label("IfEnd" + labelCount);
		labelCount++;

		
		
		//--If Condition
		Register reg1 = visit(ctx.boolExpr());
		
		//If Expr = 1 (= true) -> Then part
		//if Expr = 0 (= false) -> Else part (if exits)
		addInstruction(new Branch(reg1, new Target(2, false)));
		addInstruction(new Jump(new Target(program, elsE)));
		
		registers.clearRegister(reg1);
		
		//-- If Then
		visit(ctx.block(0));
		
		if(ctx.block().size() == 2){
			//Elsepart present
			
			//Send thenpart to end of the if-Statement
			addInstruction(new Jump(new Target(program, ifEnd)));

			addInstruction(elsE, new Nop());
			visit(ctx.block(1));
			addInstruction(ifEnd, new Nop());
	
			
		} else {
			//No Elsepart
			addInstruction(elsE, new Nop());
		}
		
		return null; 
		
	}

	@Override public Register visitStatWhile(@NotNull YallParser.StatWhileContext ctx) { 
		
		Label cond = new Label("WhileCond" + labelCount);
		Label then = new Label("WhileDo" + labelCount);
		Label end = new Label("WhileEnd" + labelCount);
		
		//---While condition
		addInstruction(cond, new Nop());
		Register reg1 = visit(ctx.boolExpr());
		
		//If Expr = 1 (= true) -> Loop
		//if Expr = 0 (= false) -> Break
		addInstruction(new Branch(reg1, new Target(program, then)));
		addInstruction(new Jump(new Target(program, end)));

		registers.clearRegister(reg1);
		
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

	//TODO Lock output so only one thread can print at any time
	@Override public Register visitStatOutputBool(@NotNull YallParser.StatOutputBoolContext ctx) { 
		Register reg1 = visit(ctx.boolExpr());
		addInstruction(new Branch(reg1, new Target(12, false)));
		
		//False
		addInstruction(new Constant(102, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(97, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(108, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(115, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(101, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Jump(new Target(9, false)));
	
		//True
		addInstruction(new Constant(116, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(114, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(117, reg1));
		addInstruction(new Write(reg1, stdio));
		addInstruction(new Constant(101, reg1));
		addInstruction(new Write(reg1, stdio));
		
		//NewLine
		addInstruction(new Constant(10, reg1));
		addInstruction(new Write(reg1, stdio));
			
		registers.clearRegister(reg1);
			
		return null; 
	}
	
// TODO	
//	@Override public T visitStatOutputInt(@NotNull YallParser.StatOutputIntContext ctx) { return visitChildren(ctx); }
	
	@Override public Register visitStatLock(@NotNull YallParser.StatLockContext ctx) { 
		
		Register reg1 = registers.getFreeRegister();
		
		//lockAddress = flag isOwned
		//lockAddress + 1 = SPID of owner
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

		registers.clearRegister(reg1);

		return null;
	}

	
	/*
	 * 	------------EXPRESSION----------------
	 * Expressions give back a register with their value inside it
	 */
	
	@Override public Register visitExprNumExpr(@NotNull YallParser.ExprNumExprContext ctx) { 
		return visit(ctx.addExpr()); 
	}

	@Override public Register visitExprBoolExpr(@NotNull YallParser.ExprBoolExprContext ctx) { 
		return visit(ctx.boolExpr()); 
	}

	/*
	 * 	------------EXPRESSION----------------
	 * 				boolExpr
	 */
	
	@Override public Register visitBoolParanteses(@NotNull BoolParantesesContext ctx) { 
		return visit(ctx.boolExpr()); 
	}
	
	@Override public Register visitBoolExprBoolOp(@NotNull YallParser.BoolExprBoolOpContext ctx) { 
		Register reg1 = visit(ctx.boolExpr(0));
		Register reg2 = visit(ctx.boolExpr(1));
		
		if(ctx.boolOp().AND() != null){
			addInstruction(new Compute(OpCode.AND, reg1, reg2, reg2));
		} else if(ctx.boolOp().OR() != null){
			addInstruction(new Compute(OpCode.OR, reg1, reg2, reg2));
		} else if(ctx.boolOp().XOR() != null){
			addInstruction(new Compute(OpCode.XOR, reg1, reg2, reg2));
		} else {
			addError(ctx.start.getLine(),String.format("Boolop %s not found!", ctx.boolOp().getText()));
		}
		
		registers.clearRegister(reg1);
		return reg2; 
	}

	@Override public Register visitBoolExprNot(@NotNull YallParser.BoolExprNotContext ctx) { 
		Register reg1 = visit(ctx.boolExpr());
		Register reg2 = registers.getFreeRegister();
		
		//XOR-ing a boolean with True results in the opposite value
		addInstruction(new Constant(1, reg2));
		addInstruction(new Compute(OpCode.XOR, reg1, reg2, reg2));
		
			registers.clearRegister(reg1);
		return reg2; 	
	}

	@Override public Register visitBoolExprCompOp(@NotNull YallParser.BoolExprCompOpContext ctx) { 
		Register reg1 = visit(ctx.addExpr(0));
		Register reg2 = visit(ctx.addExpr(1));
		
		if(ctx.compOp().GT() != null){
			addInstruction(new Compute(OpCode.GT, reg1, reg2, reg2));
		} else if(ctx.compOp().LT() != null){
			addInstruction(new Compute(OpCode.LT, reg1, reg2, reg2));
		} else if(ctx.compOp().GE() != null){
			addInstruction(new Compute(OpCode.GTE, reg1, reg2, reg2));
		} else if(ctx.compOp().LE() != null){
			addInstruction(new Compute(OpCode.LTE, reg1, reg2, reg2));		
		} else {
			addError(ctx.start.getLine(),String.format("CompOp %s not found!", ctx.compOp().getText()));
		}
		
			registers.clearRegister(reg1);

		return reg2;
	}	
	
	@Override public Register visitBoolExprCompEqOpAdd(@NotNull YallParser.BoolExprCompEqOpAddContext ctx) { 
		Register reg1 = visit(ctx.addExpr(0));
		Register reg2 = visit(ctx.addExpr(1));
		
		if(ctx.compEqOp().EQ() != null){
			addInstruction(new Compute(OpCode.EQUAL, reg1, reg2, reg2));
		} else if(ctx.compEqOp().NE() != null){
			addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg2));
		} else {
			addError(ctx.start.getLine(),String.format("CompEqOp %s not found!", ctx.compEqOp().getText()));
		}
		
		registers.clearRegister(reg1);

		return reg2;
	}
	
	@Override public Register visitBoolExprCompEqOpBool(@NotNull YallParser.BoolExprCompEqOpBoolContext ctx) { 
		Register reg1 = visit(ctx.boolExpr(0));
		Register reg2 = visit(ctx.boolExpr(1));
		
		if(ctx.compEqOp().EQ() != null){
			addInstruction(new Compute(OpCode.EQUAL, reg1, reg2, reg2));
		} else if(ctx.compEqOp().NE() != null){
			addInstruction(new Compute(OpCode.NEQUAL, reg1, reg2, reg2));
		} else {
			addError(ctx.start.getLine(),String.format("CompEqOp %s not found!", ctx.compEqOp().getText()));
		}
		
		registers.clearRegister(reg1);

		return reg2;
	}
	
	@Override public Register visitBoolExprIDExpr(@NotNull YallParser.BoolExprIDExprContext ctx) { 
		return visit(ctx.idExpr()); 
	}
	
	@Override public Register visitBoolExprBool(@NotNull YallParser.BoolExprBoolContext ctx) { 
		return visit(ctx.bool()); 
	}
	
	
	/*
	 * 	------------EXPRESSION----------------
	 * 				addExpr
	 */
	
	@Override public Register visitAddExprAddOp(@NotNull YallParser.AddExprAddOpContext ctx) { 
		Register reg1 = visit(ctx.addExpr(0));
		Register reg2 = visit(ctx.addExpr(1));
		
		if(ctx.addOp().PLUS() != null){
			addInstruction(new Compute(OpCode.ADD, reg1, reg2, reg2));
		} else if(ctx.addOp().MINUS() != null){
			addInstruction(new Compute(OpCode.SUB, reg1, reg2, reg2));	
		} else {
			addError(ctx.start.getLine(),String.format("AddOp %s not found!", ctx.addOp().getText()));
		}
		
		registers.clearRegister(reg1);

		return reg2;
	}	
	
	@Override public Register visitAddExprMultExpr(@NotNull YallParser.AddExprMultExprContext ctx) { 
		return visit(ctx.multExpr()); 
	}
	
	/*
	 * 	------------EXPRESSION----------------
	 * 				multExpr
	 */
	
	@Override public Register visitMultExprMultOp(@NotNull YallParser.MultExprMultOpContext ctx) { 
		Register reg1 = visit(ctx.multExpr(0));
		Register reg2 = visit(ctx.multExpr(1));
		
		if(ctx.multOp().TIMES() != null){
			addInstruction(new Compute(OpCode.MUL, reg1, reg2, reg2));
		} else if(ctx.multOp().DIVIDE() != null){
			addInstruction(new Compute(OpCode.DIV, reg1, reg2, reg2));	
		} else if(ctx.multOp().MODULO() != null){
			addInstruction(new Compute(OpCode.MOD, reg1, reg2, reg2));	
		} else {
			addError(ctx.start.getLine(),String.format("MultOp %s not found!", ctx.multOp().getText()));
		}
		
		registers.clearRegister(reg1);

		return reg2;
	}

	@Override public Register visitMultExprParenteses(@NotNull YallParser.MultExprParentesesContext ctx) { 
		return visit(ctx.addExpr()); 
	}

	@Override public Register visitMultExprIntExpr(@NotNull YallParser.MultExprIntExprContext ctx) { 
		return visit(ctx.intExpr()); 
	}

	/*
	 * 	------------EXPRESSION----------------
	 * 				intExpr
	 */
	
	@Override public Register visitIntExprNum(@NotNull YallParser.IntExprNumContext ctx) {
		Register reg1 = registers.getFreeRegister();
		
		int value = Integer.parseInt(ctx.NUM().getText());
		addInstruction(new Constant(value, reg1));
		
		return reg1; 
	}

	
	
	@Override public Register visitIntExprAdd(@NotNull YallParser.IntExprAddContext ctx) { 
		Register reg1 = visit(ctx.intExpr());
		
		//Add 1 per plus sign
		int adds = ctx.ADD().size();
		
		if(adds == 1){
			//Using the INCREMENT operator saves one instruction
			addInstruction(new Compute(OpCode.INCR, reg1, reg1, reg1));
			
		} else {
		Register reg2 = registers.getFreeRegister();

		addInstruction(new Constant(adds, reg2));
		addInstruction(new Compute(OpCode.ADD, reg1, reg2, reg1));
		
		registers.clearRegister(reg2);
		}
		
		return reg1;
	}

	@Override public Register visitIntExprSub(@NotNull YallParser.IntExprSubContext ctx) { 
		Register reg1 = visit(ctx.intExpr());
		
		//Add 1 per plus sign
		int subs = ctx.SUB().size();
		
		if(subs == 1){
			//Using the DECREMENT operator saves one instruction
			addInstruction(new Compute(OpCode.DECR, reg1, reg1, reg1));
			
		} else {
		Register reg2 = registers.getFreeRegister();

		addInstruction(new Constant(subs, reg2));
		addInstruction(new Compute(OpCode.SUB, reg1, reg2, reg1));
		
		registers.clearRegister(reg2);

		}
		return reg1;
	}
	
	/*
	 * 	------------EXPRESSION----------------
	 * 				idExpr
	 */
	
	@Override public Register visitIdExprID(@NotNull YallParser.IdExprIDContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		
		Variable localID = idtable.getID(ctx.ID().getText());
		if(localID != null){
			//Variable in local Scope
			addInstruction(new Load(new MemAddr(localID.getOffset()), reg1));
		}else{
			Variable globalID = globalScope.getID(ctx.ID().getText());
			if(globalID != null){
				//Variable in Global Scope
				addInstruction(new Read(new MemAddr(globalVarOffset + globalID.getOffset())));
				addInstruction(new Receive(reg1));
			} else {
				//Variable not found in Global nor local scope, should be caught by the checker!
				addError(ctx.start.getLine(),String.format("Variable %s is not found in global or local, should have been caught by the checker", ctx.ID().getText()));
			}
		}		
		return reg1; 
	}

	@Override public Register visitIdExprUp(@NotNull YallParser.IdExprUpContext ctx) {
		Register reg1 = registers.getFreeRegister();
		
		
		//Get to the right IDTable
		IDTable localIDTable = idtable;
		
		int upDepth = 0;
		if(ctx.NUM() != null){
			//Argument given, (at least) x scopes above the current one
			int num = Integer.parseInt(ctx.NUM().getSymbol().getText());
			upDepth = num;
			
			//Go x scopes up
			while(num > 0 && localIDTable != null){
				localIDTable = idtable.getParentScope();
				num--;
			}
		} else {
			//No argument given, seek in any scope except the current one
			upDepth = 1;
			
			//Go one scope up
			localIDTable = idtable.getParentScope();
		}
		

		//Set globalScope if necessary
		if(idtable.getDepth() == upDepth){
			//If depth should be 0, target scope is the global scope
			localIDTable = globalScope;
		}
		
		
		//Get Variable
		if(localIDTable == null){
			//No scope exists upDepth levels higher than current scope
			addError(ctx.start.getLine(),String.format("No scope is found %d levels above %s. Checker should have caught this"  , upDepth, ctx.ID().getText()));
			return reg_zero;
		} else {
			//Scope found
			Variable id = localIDTable.getID(ctx.ID().getText());
			if(id != null){
				//Variable found in scope
				addInstruction(new Load(new MemAddr(id.getOffset()), reg1));
			} else {
				//Variable not found in target scope or up
				id = globalScope.getID(ctx.ID().getText());
				if(id != null){
					//Variable not found in target local scope, but found in global scope
					addInstruction(new Read(new MemAddr(globalVarOffset + id.getOffset())));
					addInstruction(new Receive(reg1));
					
				} else {
				//Variable not found in local or global scope
					addError(ctx.start.getLine(),String.format("Variable %s is not declared %d or more levels higher, should have been caught by the checker", ctx.ID().getText(), upDepth));
				return reg_zero;
				}
			}
		}
		return reg1; 
	}
	
	@Override public Register visitIdExprBlock(@NotNull YallParser.IdExprBlockContext ctx) { 
		return visit(ctx.expr()); 
	}

	
	
	/*
	 * 	------------OTHER---------------------
	 */
	
	@Override public Register visitBoolTrue(@NotNull YallParser.BoolTrueContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		addInstruction(new Constant(1, reg1));	

		return reg1; 
	}
	
	@Override public Register visitBoolFalse(@NotNull YallParser.BoolFalseContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		addInstruction(new Constant(0, reg1));	
		return reg1;
	}


	
	/*
	 * 	------------GENERATOR METHODS---------------------
	 */	
	
	
	public void addInstruction(Instruction i){
		program.addInstruction(i);
	}
	
	public void addInstruction(Label l, Instruction i){
		program.addInstruction(l, i);
	}
	
	public Program getProgram(){
		return program;
	}
	
	//Add error to the error list
	private void addError(int line, String text){
		if(line != 0){
			errors.add(String.format("Line %d : %s", line, text ));
		} else {
			errors.add(text);
		}
		
	}
	public List<String> getErrors(){
		return errors;
	}


}
