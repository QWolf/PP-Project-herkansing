package checker;

import java.util.HashMap;
import java.util.Map;

public class IDTable {
	private IDTable parentscope;
	private  Map<String, ID> table = new HashMap<String, ID>();
	
	public IDTable(IDTable parScope){
		this.parentscope = parScope;
	}
	
	public boolean addVariable(Type type, String id){
		if(type == Type.ERROR || type == Type.NONE){
			System.out.println("Trying to add an error type variable: " + id);
			return false;
		} else if(type == Type.FUNCTION){
			System.out.println("Trying to add a function as a variable: " + id);
			return false;
		} else if(existsCurrentScope(id)){
			System.out.println("Name in use, variable not made: " + id);
			return false;
		} else {
			Variable var = new Variable(type);
			table.put(id, var);
			return true;
		}
	}
	
	public boolean addFunction(Type returnType, String id, Type[] argsType, String[] argsName){
		if(returnType == Type.FUNCTION){
			System.out.println("Trying to add a function with a function as return type: " + id);
			return false;
		} else if (returnType == Type.ERROR) {
			System.out.println("Trying to add a function with an error as return type: " + id);
			return false;
		} else if(existsCurrentScope(id)){
			System.out.println("Name in use, function not made: "+ id);
			return false;
		} else if(argsType.length != argsName.length){
			System.out.println("Incomplete arguments in " + id + " " + argsName + " " + argsType);
			return false;
		} else {
			Function func = new Function(this, returnType, argsType, argsName);
			table.put(id, func);
			return true;
			
			
		}
	}
	
	
	
	
	public boolean existsCurrentScope(String id){
		return table.containsKey(id);
	}
	
	public ID getID(String id){
		if(table.containsValue(id)){
			return table.get(id);
		} else if(parentscope != null){
			return parentscope.getID(id);
		} else {
			return null;
		}
	}

}
