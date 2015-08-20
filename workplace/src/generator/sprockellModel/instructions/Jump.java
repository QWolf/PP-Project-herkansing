package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Target;

public class Jump extends Instruction{
	private final Target target;

	
	public Jump(Label label, Target t){
		super(label);
		this.target = t;
	}
	public Jump(Target t){
		this(null, t);
	}
	
	@Override
	public String getFullCommand() {
		return String.format("Jump %s", target.getCode());
	}
	
	public String getFullLabilizedCommand(){
		return String.format("Jump %s", target.getLabilizedCode());
	}

}
