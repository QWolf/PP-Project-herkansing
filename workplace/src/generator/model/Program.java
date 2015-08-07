package generator.model;

import generator.model.instructions.Instruction;
import generator.model.operands.Label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Program {
	
	private final Map<String, Label> labelTable;
	private final List<Instruction> instructions;
	
	public Program(){
		this.instructions = new ArrayList<Instruction>();
		this.labelTable = new HashMap<String, Label>();
	}
	
	
	
	public void addInstruction(Label l, Instruction i){
		i.g
	}

}
