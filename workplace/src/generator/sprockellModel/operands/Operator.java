package generator.sprockellModel.operands;

public class Operator extends Operand{
	private final OpCode opcode;

	public Operator(OpCode opcode) {
		super(ArgType.OPERATOR);
		this.opcode = opcode;
	}

	@Override
	public String getCode() {
		return OpCode.getName(opcode);
	}
	
	

}
