package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Register;

public class Pop extends Instruction{
	
	private final Register reg;
	
	public Pop(Label l, Register reg){
		super(l);
		this.reg = reg;
	}
	
	public Pop(Register reg){
		this(null, reg);
	}

	@Override
	public String getFullCommand() {
		return String.format("Pop %s", reg.getCode());
	}

}
