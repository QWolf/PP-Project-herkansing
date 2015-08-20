package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;

public class Debug extends Instruction{
	private final String text;
	
	public Debug (Label l, String text){
		super(l);
		this.text = text;
	}
	
	public Debug(String text){
		this(null, text);
	}

	@Override
	public String getFullCommand() {
		return String.format("(%s)", text);
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}

}
