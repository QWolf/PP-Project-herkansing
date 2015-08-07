package generator.model.operands;

public enum OpCode {
	ADD, SUB, MUL, DIV, MOD,
	
	EQUAL, NEQUAL, GT, LT, GTE, LTE,
	
	AND, OR, XOR, LSHIFT, RSHIFT,
	
	DECR, INCR;
	
	
	public static String getName(OpCode opcode){
		String s;
		switch(opcode){
		case ADD: 
			s = "Add";
			break;
		case SUB:
			s = "Sub";
			break;
		case MUL:
			s = "Mul";
			break;
		case DIV:
			s = "Div";
			break;
		case MOD:
			s = "Mod";
			break;
		case EQUAL:
			s = "Equal";
			break;
		case NEQUAL:
			s = "NEq";
			break;
		case GT:
			s = "Gt";
			break;
		case LT:
			s = "Lt";
			break;
		case GTE:
			s = "GtE";
			break;
		case LTE:
			s = "LtE";
			break;
		case AND:
			s = "And";
			break;
		case OR:
			s = "Or";
			break;
		case XOR:
			s = "Xor";
			break;
		case LSHIFT:
			s = "LShift";
			break;
		case RSHIFT:
			s = "RShift";
			break;
		case DECR:
			s = "Decr";
			break;
		case INCR:
			s = "Incr";
			break;
		default:
			s = "ERROR";
			System.err.println("Undefined operator. This should not happen!");
		}
		return null;
		
	}
}
