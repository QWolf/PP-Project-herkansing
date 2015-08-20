package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;

public class EndProg extends Instruction{
	
	public EndProg(Label l){
		super(l);
	}
	
	public EndProg(){
		this(null);
	}

	@Override
	public String getFullCommand() {
		return "EndProg";
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}
	
	

}
