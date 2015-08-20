package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;
import generator.sprockellModel.operands.Register;

public class Write extends Instruction {
	
	private final Register reg;
	private final MemAddr addr;
	
	public Write(Label l, Register reg, MemAddr addr){
		super(l);
		this.reg = reg;
		this.addr = addr;
	}
	
	public Write(Register reg, MemAddr addr){
		this(null, reg, addr);
	}

	@Override
	public String getFullCommand() {
		return String.format("Write %s %s", reg.getCode(), addr.getCode());
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}

}
