package generator.model.instructions;

import java.util.HashMap;

import generator.model.operands.Label;
import generator.model.operands.Register;
import generator.model.operands.Value;

public class Constant extends Instruction{
	private final Value value;
	private final Register reg;
	public Constant(Label label, Value value, Register reg){
		super(label);
		this.value = value;
		this.reg = reg;
	}
	
	
	public Constant( Value value, Register reg){
		this(null, value, reg);
		}


	@Override
	public String getFullCommand(HashMap<String, Label> labelTable) {
		return String.format("Const %s %s", value, reg.getCode());
	}

}
