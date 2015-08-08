package generator;

import generator.sprockellModel.Program;
import generator.sprockellModel.RegisterManager;
import generator.sprockellModel.instructions.Branch;
import generator.sprockellModel.instructions.Compute;
import generator.sprockellModel.instructions.Nop;
import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.OpCode;
import generator.sprockellModel.operands.Operator;
import generator.sprockellModel.operands.Register;
import generator.sprockellModel.operands.Target;
import grammar.YallBaseVisitor;
import grammar.YallParser;

import org.antlr.v4.runtime.misc.NotNull;

import checker.YallChecker;

public class Generator extends YallBaseVisitor<Object>{
	
	private YallChecker checker;
	private Program program;
	private final RegisterManager registers = new RegisterManager();

	//Indicates which label should be used for the next fork
	private int nextFork = 1;
	
	/*
	 * Standard Registers to use
	 */
	private static Register reg_zero = new Register("Zero");
	private static Register reg_pc = new Register("PC");
	private static Register reg_sp = new Register("SP");
	private static Register reg_spid = new Register("SPID");

	
	@Override public Object visitProgram(@NotNull YallParser.ProgramContext ctx) { 
		program = new Program(ctx.ID().getText());
		
		if(ctx.init() != null){
			//TODO Threads Finished
			//TODO Locks
			visit(ctx.init());
		}	
		if(!checker.getThreads().isEmpty()){
			Register reg1 = registers.getFreeRegister();
			program.addInstruction(null, new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
			program.addInstruction(null, new Branch(reg1, new Target(program, new Label("Fork1"))));
			nextFork++;
			registers.clearRegister(reg1);
		}
		visit(ctx.toplevelblock());
		return null; 
	}
	
	/*
	 * 	------------INIT------------------------
	 */
	@Override public Object visitInit(@NotNull YallParser.InitContext ctx) { 
		Register reg1 = registers.getFreeRegister();
		program.addInstruction(null, new Compute(OpCode.NEQUAL, reg_spid, reg_zero, reg1));
		program.addInstruction(null, new Branch(reg1, new Target(program, new Label("EndOfInit"))));
		registers.clearRegister(reg1);
		
		
		program.addInstruction(new Label("EndOfInit"), new Nop());
		return visitChildren(ctx); 
	}

	
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	@Override public Object visitToplvlBlock(@NotNull YallParser.ToplvlBlockContext ctx) { 
		
		return visitChildren(ctx); 
	}

	@Override public Object visitToplvlStat(@NotNull YallParser.ToplvlStatContext ctx) { 
		
		return visitChildren(ctx); 
	}

	@Override public Object visitToplvlFork(@NotNull YallParser.ToplvlForkContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override public Object visitToplvlJoin(@NotNull YallParser.ToplvlJoinContext ctx) { 
		return visitChildren(ctx); 
	}
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	/*
	 * 	------------TOPLEVELBLOCK---------------
	 */
	
	
	
	public void setChecker(YallChecker checker){
		this.checker = checker;
	}
	
	public Program getProgram(){
		return program;
	}


}
