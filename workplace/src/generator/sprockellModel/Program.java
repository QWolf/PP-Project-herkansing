package generator.sprockellModel;

import generator.sprockellModel.instructions.Instruction;
import generator.sprockellModel.operands.Label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
	
	private final Map<Label, Integer> labelTable;
	private final List<Instruction> instructions;
	private final String name;
	
	public Program(String name){
		this.instructions = new ArrayList<Instruction>();
		this.labelTable = new HashMap<Label, Integer>();
		this.name = name;
	}
	
	
	
	public void addInstruction(Label l, Instruction i){
		
	}
	
	public void buildLabelTable(){
		labelTable.clear();
		for(int i = 0; i < instructions.size(); i++){
			
			if(instructions.get(i).hasLabel()){
				Label label = instructions.get(i).getLabel();
				if(!labelTable.containsKey(label)){
					labelTable.put(label, i);
				} else {
					System.err.println("Double label : " + label.getName());
				}
			}
		}
	}
	
	public Map<Label, Integer> getLabelTable(){
		return labelTable;
	}
	
	public String getFullProgramCode(){
		buildLabelTable();
		String answer = "[";
		for(Instruction i : instructions){
			answer = answer + i.getFullCommand() + ", /n ";
		}
		answer = answer + "Endprogram]";
		System.out.println(answer);
		return answer;
	}
	
	public String getProgramName(){
		return name;
	}

}
