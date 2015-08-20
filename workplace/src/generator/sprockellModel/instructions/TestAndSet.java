package generator.sprockellModel.instructions;

import generator.sprockellModel.operands.Label;
import generator.sprockellModel.operands.MemAddr;

public class TestAndSet extends Instruction{

	private final MemAddr addr;
	
	public TestAndSet(Label l, MemAddr addr){
		super(l);
		this.addr = addr;
	}
	
	public TestAndSet(MemAddr addr){
		this(null, addr);
	}

	@Override
	public String getFullCommand() {
		return String.format("TestAndSet %s", addr.getCode());
	}
	
	public String getFullLabilizedCommand(){
		return getFullCommand();
	}
	
}
