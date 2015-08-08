package generator.sprockellModel.instructions;


import generator.sprockellModel.operands.Label;

public abstract class Instruction {
	private Label label;
	
	protected Instruction(Label label){
		this.label = label;
	}
	
	
	public abstract String getFullCommand();



	public boolean hasLabel(){
		return label != null;
	}
	
	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
	
	

}
