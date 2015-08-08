package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Register;

public class Receive extends Instruction{
	
	private final Register reg;
	
	public Receive(Label l, Register reg){
		super(l);
		this.reg = reg;
	}
	
	public Receive(Register reg){
		this(null, reg);
	}

	@Override
	public String getFullCommand() {
		return String.format("Receive %s", reg.getCode());
	}

}
