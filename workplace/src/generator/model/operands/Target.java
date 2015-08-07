package generator.model.operands;


public class Target extends Operand {
	private final TargetType targetType;
	private Register indRegTarget;
	private Label label;
	private int codeAddr;
	
	public Target(Label label){
		super(ArgType.TARGET);
		this.targetType = TargetType.ABSOLUTE;
		this.label = label;
	}
	
	public Target(int codeAddr, boolean absolute){
		super(ArgType.TARGET);
		if(absolute){
			this.targetType = TargetType.ABSOLUTE;
		} else {
			this.targetType = TargetType.RELATIVE;
		}
	}
	
	public Target(Register reg){
		super(ArgType.TARGET);
		this.targetType = TargetType.INDIRECT;
	}
	
	public TargetType getTargetType(){
		return this.targetType;
	}
	
	public boolean hasLabel(){
		return label != null;
	}

	
	
	
	/** Enum of different Target Types */
	public static enum TargetType {
		//Absolute Jump
		ABSOLUTE,
		//Relative Jump
		RELATIVE,
		//Indirect Jump
		INDIRECT,
		//Label
		LABEL
	}




	@Override
	public String getCode() {
		String ret;
		switch(targetType){
		case ABSOLUTE: 
			ret = "(Abs "+ codeAddr + ")";
			break;
		case RELATIVE:
			ret = "(Rel "+ codeAddr + ")";
			break;	
		case INDIRECT:
			ret = "(Ind "+ indRegTarget.getCode() + ")";
		default:
			ret = "(Abs " + label.getName() + ")";
			
		}
		return ret;
	}
	
}
