package generator.sprockellModel.operands;


public abstract class Operand {
	private final ArgType type;
	
	protected Operand(ArgType type){
		this.type = type;
	}
	
	public ArgType getOpType() {
		return this.type;
	}
	
	public abstract String getCode();

}
