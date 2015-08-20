package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;

public class Read extends Instruction{
	
	private final MemAddr addr;
	
	public Read(Label l, MemAddr addr){
		super(l);
		this.addr = addr;
	}
	
	public Read(MemAddr addr){
		this(null, addr);
	}

	@Override
	public String getFullCommand() {
		return String.format("Read %s", addr.getCode());
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}

}
