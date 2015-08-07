package checker;

public class Variable {
	private final Type type;
	private final int offset;

	public Variable(Type type, int offset) {
		this.type = type;
		this.offset = offset;
	}

	public Type getType() {
		return type;
	}
	
	public int getOffset(){
		return offset;
	}



}
