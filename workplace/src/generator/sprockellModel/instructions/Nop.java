package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;

public class Nop extends Instruction{
	
	public Nop(Label l){
		super(l);
	}
	
	public Nop(){
		this(null);
	}

	@Override
	public String getFullCommand() {
		return "Nop";
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}
	
	

}
