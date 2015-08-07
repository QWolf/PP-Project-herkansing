package generator.model.operands;

import generator.model.instructions.Instruction;

public class Label {
	private final String name;
	private Instruction inst;
	
	public Label(String name, Instruction inst){
		this.name = name;
		assert(inst != null);
		this.inst = inst;
	}

	public String getName() {
		return name;
	}
	
	public Instruction getInstruction(){
		return inst;
	}
	
	//Move this label to a new(preferrably non-NOP) location
	public boolean setInstruction(Instruction i){
		if(i!= null){
			inst = i;
		} 
		return i == null;
		
	}

}
