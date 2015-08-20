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
	private final String name;
	
	public Program(String name){
		this.instructions = new ArrayList<Instruction>();
		this.labelTable = new HashMap<String, Integer>();
		this.name = name;
	}
	
	
	
	public void addInstruction(Label l, Instruction i){
		i.setLabel(l);
		addInstruction(i);
	}
	
	public void addInstruction(Instruction i){
		instructions.add(i);
	}
	
	
	
	public void buildLabelTable(){
		labelTable.clear();
		for(int i = 0; i < instructions.size(); i++){
			
			if(instructions.get(i).hasLabel()){
				Label label = instructions.get(i).getLabel();
				if(!labelTable.containsKey(label.getName())){
					labelTable.put(label.getName(), i);
				} else {
					System.err.println("Double label : " + label.getName());
				}
			}
		}
		
		//Print label Table
		System.out.println();
		System.out.println("LabelTable");
		for(String l : labelTable.keySet()){
			System.out.println(l + "\t" + labelTable.get(l));
		}
		System.out.println();

		
	}
	
	public Map<String, Integer> getLabelTable(){
		return labelTable;
	}
	
	public String getFullProgramCode(){
		buildLabelTable();
		String answer = "[";
		for(Instruction i : instructions){
			answer = answer + i.getFullCommand() + ", \n ";
		}
		answer = answer + "Nop]";
		//TODO Print to file
//		System.out.println(answer);
		return answer;
	}
	
	public String getFullLabilizedProgram(){
		buildLabelTable();
		String answer = "[";
		for(Instruction i : instructions){
			if(i.hasLabel()){
				answer = answer + i.getLabel().getName() + "\t";
			} else {
				answer = answer + "\t\t";
			}
			answer = answer  + i.getFullLabilizedCommand() + ", \n ";
		}
		answer = answer + "Nop]";
		//TODO Print to file
//		System.out.println(answer);
		return answer;
	}
	
	public String getProgramName(){
		return name;
	}


}
