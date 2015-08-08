package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Register;

public class Push extends Instruction{
	
	private final Register reg;
	
	public Push(Label l, Register reg){
		super(l);
		this.reg = reg;
	}
	
	public Push(Register reg){
		this(null, reg);
	}

	@Override
	public String getFullCommand() {
		return String.format("Push %s", reg.getCode());
	}

}
