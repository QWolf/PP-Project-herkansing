package checker;

public class Variable implements ID{
	private Type type;

	public Variable(Type type2) {
		this.type = type2;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

}
