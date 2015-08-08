package generator.sprockellModel;

import generator.sprockellModel.instructions.Instruction;
import generator.sprockellModel.operands.Label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
	
	private final Map<String, Integer> labelTable;
	private final List<Instruction> instructions;
	
	public Program(){
		this.instructions = new ArrayList<Instruction>();
		this.labelTable = new HashMap<String, Integer>();
	}
	
	
	
	public void addInstruction(Label l, Instruction i){
		
	}
	
	public void buildLabelTable(){
		labelTable.clear();
		for(int i = 0; i < instructions.size(); i++){
			if(instructions.get(i).hasLabel()){
				labelTable.put(instructions.get(i).getLabel().getName(), i);
			}
		}
	}
	
	public Map<String, Integer> getLabelTable(){
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

}
