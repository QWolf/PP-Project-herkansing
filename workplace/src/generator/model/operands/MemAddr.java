package generator.model.operands;

public class MemAddr extends Operand{
	private int address;
	private final boolean isDeRef;
	private Register reg;
	
	public MemAddr(int address){
		super(ArgType.MEMADDR);
		this.address = address;
		isDeRef = false;
	}
	
	public MemAddr(Register reg){
		super(ArgType.MEMADDR);
		this.reg = reg;
		isDeRef = true;
	}

	@Override
	public String getCode() {
		if(isDeRef){
			return "(Deref " + reg.getCode() + ")";
		} else {
			return "(Addr " + address + ")";
		}
		
	}

}
