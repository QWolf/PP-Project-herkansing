package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.Register;
import generator.sprockellModel.operands.Value;

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

	public Constant(Label label, int value, Register reg){
		super(label);
		this.value = new Value(value);
		this.reg = reg;
	}
	
	public Constant( int value, Register reg){
		this(null, value, reg);
		}
	
	
	@Override
	public String getFullCommand() {
		return String.format("Const %s %s", value, reg.getCode());
	}

}
