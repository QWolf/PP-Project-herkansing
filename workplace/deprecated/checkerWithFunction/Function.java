package checker;


public class Function implements ID{
	private IDTable parentTable;
	private IDTable ownTable;
	private Type type;
	
	
	public Function(IDTable parent, Type returnType, Type[] argsType, String [] argsName){
		this.parentTable = parent;
		ownTable = new IDTable(parent);
		if(argsName.length != 0){
			for (int i = 0; i < argsName.length; i++){
				ownTable.addVariable(argsType[i], argsName[i]);
			}
		}	
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public boolean isFunction() {
		return true;
	}
	
	public IDTable getParentTable(){
		return parentTable;
	}

}
