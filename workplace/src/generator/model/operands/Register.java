package generator.model.operands;

public class Register extends Operand {
	private final String name;

	public Register(String name) {
		super(ArgType.REGISTER);
		this.name = name;
	}
	

	@Override
	public String getCode() {
		return name;
	}

}
