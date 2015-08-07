package generator.model.instructions;

import generator.model.operands.Label;
import generator.model.operands.OpCode;
import generator.model.operands.Register;

public class Compute extends Instruction{
	private final OpCode opcode;
	private final Register reg1;
	private final Register reg2;
	private final Register reg3;
	

	
	public Compute(Label label, OpCode op, Register reg1, Register reg2, Register reg3){
		super(label);
		this.reg1 = reg1;
		this.reg2 = reg2;
		this.reg3 = reg3;
		this.opcode = op;
		
	}
	
	public Compute(OpCode op, Register reg1, Register reg2, Register reg3){
		this(null, op, reg1, reg2, reg3);
	}	
	
	

	@Override
	public String getFullCommand() {
		return String.format("Compute %s %s %s %s", OpCode.getName(opcode), reg1.getCode(), reg2.getCode(), reg3.getCode() );
	}

}
