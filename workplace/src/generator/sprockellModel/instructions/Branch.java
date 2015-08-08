package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Register;
import generator.sprockellModel.operands.Target;


public class Branch extends Instruction{

	private final Register reg;
	private final Target target;
	
	
	public Branch(Label label, Register reg, Target target){
		super(label);
		this.reg = reg;
		this.target = target;
	}
	
	public Branch(Register reg, Target target){
		this(null, reg, target);
	}

	@Override
	public String getFullCommand() {		
		return String.format("Branch %s %s", reg.getCode(), target.getCode());
	}
}
