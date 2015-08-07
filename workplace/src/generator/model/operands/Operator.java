package generator.model.operands;

public class Operator extends Operand{
	private final OpCode opcode;

	protected Operator(ArgType type, OpCode opcode) {
		super(ArgType.OPERATOR);
		this.opcode = opcode;
	}

	@Override
	public String getCode() {
		return OpCode.getName(opcode);
	}
	
	

}
