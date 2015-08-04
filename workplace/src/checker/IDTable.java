package checker;

import java.util.HashMap;
import java.util.Map;

public class IDTable {
	private int offset = 999999;
	private final IDTable parentscope;
	private final Map<String, Variable> table = new HashMap<String, Variable>();
	
	public IDTable(IDTable parScope, int parentoffset){
		this.parentscope = parScope;
		//TODO parentoffset
	}
	
	public String addVariable(Type type, String id){
		if(type == Type.ERROR ){
			return "Trying to add an error type variable: " + id;
			
		} else if(existsCurrentScope(id)){
			return "Name in use, variable not made: " + id;	
		} else {
			Variable var = new Variable(type, offset);
			table.put(id, var);
			return null;
		}
	}
	
	
	public boolean existsCurrentScope(String id){
		return table.containsKey(id);
	}
	
	/**
	 * 	Returns the Variable of given ID in the lowest possible scope it is available, elseway returns null
	 */
	public Variable getID(String id){
		if(table.containsValue(id)){
			return table.get(id);
		} else if(parentscope != null){
			return parentscope.getID(id);
		} else {
			return null;
		}
	}
	
	public IDTable getParentScope(){
		return parentscope;
	}


}
