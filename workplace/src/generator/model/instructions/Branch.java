package generator.model.instructions;

import generator.model.operands.Label;
import generator.model.operands.Register;
import generator.model.operands.Target;

import java.util.HashMap;

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
	public String getFullCommand(HashMap<String, Label> labelTable) {
		
		
		return null;
	}
}
