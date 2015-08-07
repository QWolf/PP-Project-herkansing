package generator.model.instructions;


import generator.model.operands.Label;

public abstract class Instruction {
	private Label label;
	
	protected Instruction(Label label){
		this.label = label;
	}
	
	
	public abstract String getFullCommand();



	public Label getLabel() {
		return label;
	}



	public void setLabel(Label label) {
		this.label = label;
	}
	
	

}
