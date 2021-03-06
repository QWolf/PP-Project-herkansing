package generator.sprockellModel.operands;

import generator.sprockellModel.Program;

import java.util.Map;


public class Target extends Operand {
	private final TargetType targetType;
	private Register indRegTarget;
	private Label label;
	private int codeAddr;
	private Program program;
	
	
	/*
	 * Jump to label, Program is provided to access the labelTable later on
	 */
	public Target(Program p, Label goalLabel){
		super(ArgType.TARGET);
		this.targetType = TargetType.LABEL;
		this.label = goalLabel;
		this.program = p;
	}
	
	
	/*
	 * Absolute jump if bool = true, Relative jump otherwise.
	 * Goal = codeAddr
	 */
	public Target(int codeAddr, boolean absolute){
		super(ArgType.TARGET);
		this.codeAddr = codeAddr;
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

	private String getCodeAddrCode(){
		if(codeAddr < 0){
			return "(" + codeAddr + ")";
		} else {
			return codeAddr + "";
		}
	}



		public String getCode() {
			
		String ret;
		switch(targetType){
		case ABSOLUTE: 
			ret = "(Abs "+ getCodeAddrCode() + ")";
			break;
		case RELATIVE:
			ret = "(Rel "+ getCodeAddrCode() + ")";
			break;	
		case INDIRECT:
			ret = "(Ind "+ indRegTarget.getCode() + ")";
			break;
		case LABEL:
			Map<String, Integer> labelTable = program.getLabelTable();
			ret = "(Abs " + labelTable.get(label.getName()) + ")";			
			break;
		default :
			System.err.println("Unknown Target Type");
			ret = "(Abs ??)";
			break;
		}
		return ret;
	}
		
		public String getLabilizedCode() {
			
			String ret;
			switch(targetType){
			case ABSOLUTE: 
				ret = "(Abs "+ getCodeAddrCode() + ")";
				break;
			case RELATIVE:
				ret = "(Rel "+ getCodeAddrCode() + ")";
				break;	
			case INDIRECT:
				ret = "(Ind "+ indRegTarget.getCode() + ")";
				break;
			case LABEL:
				ret = "(LBL " + label.getName() + ")";			
				break;
			default :
				System.err.println("Unknown Target Type");
				ret = "(Abs ??)";
				break;
			}
			return ret;
		}
	
}
