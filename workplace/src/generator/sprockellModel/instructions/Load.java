package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;
import generator.sprockellModel.operands.Register;

public class Load extends Instruction {
	private final MemAddr addr;
	private final Register reg;
	
	public Load(Label l, MemAddr addr, Register reg){
		super(l);
		this.addr = addr;
		this.reg = reg;
	}
	
	public Load(MemAddr addr, Register reg){
		this(null, addr, reg);
	}

	@Override
	public String getFullCommand() {
		return String.format("Load %s %s", addr.getCode(), reg.getCode());
	}

}
