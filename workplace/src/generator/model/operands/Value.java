package generator.model.operands;

public class Value extends Operand {
	private final int value;
	
	public Value(int val){
		super(ArgType.VALUE);
		this.value = val;
	}
	
	public int getValue(){
		return value;
	}

}
