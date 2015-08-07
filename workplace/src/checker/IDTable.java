package checker;

import java.util.HashMap;
import java.util.Map;

public class IDTable {
	private int offset;
	private final IDTable parentscope;
	private final Map<String, Variable> table = new HashMap<String, Variable>();
	private final int depth;
	
	public IDTable(IDTable parScope, int depth){
		this.parentscope = parScope;
		offset = 0;
		this.depth = depth;
	}
	
	/**
	 * Adds a variable to IDTable
	 * @param type 	Type of variable
	 * @param id	Name of variable
	 * @return	null if variable was added, String with error message if not
	 */
	public String addVariable(Type type, String id){
		if(type == Type.ERROR ){
			return "Trying to add an error type variable: " + id;
		} else if(existsCurrentScope(id)){
			return "Name in use, variable not made: " + id;	
		} else {
			Variable var = new Variable(type, offset);
			offset = offset + 4;
			table.put(id, var);
			return null;
		}
	}
	
	
	public boolean existsCurrentScope(String id){
		return table.containsKey(id);
	}
	
	/**
	 * 	Returns the Variable of given ID in the lowest possible scope it is available
 	 *	returns null otherwise
	 */
	public Variable getID(String id){
		if(table.containsKey(id)){
			return table.get(id);
		} else if(parentscope != null){
			return parentscope.getID(id);
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the scope above current one
	 */
	public IDTable getParentScope(){
		return parentscope;
	}

	public int getDepth() {
		return depth;
	}


}
