package generator.sprockellModel;

import generator.sprockellModel.operands.Register;

import java.util.Stack;

public class RegisterManager {
	
	private final Stack<Register> registers;
	private final Stack<Register> possibleRegisters;
	private int free = 0;

	public RegisterManager(){
		this.registers = new Stack<Register>();
		registers.push(new Register("RegA"));
		registers.push(new Register("RegB"));
		registers.push(new Register("RegC"));
		registers.push(new Register("RegD"));
		registers.push(new Register("RegE"));
		free = 5;
		possibleRegisters = registers;
	}
	
	/*
	 * returns one unused register
	 */
	public Register getFreeRegister(){
		if(registers.isEmpty()){
			System.err.println("No registers available");
			return null;
		} else{
			free--;
			return registers.pop();
		}
	}
	
	/*
	 * Puts register back onto the free stack
	 */
	public void clearRegister(Register reg){
		if(possibleRegisters.contains(reg)){
			System.err.println(String.format("Register %s is not allowed to be put on the stack!", reg.getCode()));
		} else if(!registers.contains(reg)){
			registers.push(reg);
			free++;
		} else {
			System.err.println(String.format("Register %s is already on the stack!", reg.getCode()));
		}
	}
	
	/*
	 * Returns how many free registers are available
	 */
	public int free(){
		return free;
	}
}
