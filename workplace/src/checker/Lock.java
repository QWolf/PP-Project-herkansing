package checker;

public class Lock {
	/*
	 * Represent a global Lock, to be claimed by a thread
	 */
	
	private final String id;
	
	// 2 * checker.locks.size() 
	//	-> Offset for IsLocked flag
	private final int offset;
	
	public Lock(String id, int offset){
		this.id = id;
		this.offset = offset;
	}
	
	
	public String getName(){
		return id;
	}
	
	
	public int getOffset(){
		return offset;
	}

}
