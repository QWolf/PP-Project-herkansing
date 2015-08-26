package checker;

public class Lock {
	/*
	 * Represent a global Lock, to be claimed by a thread
	 */
	
	private final String id;
	
	// Global Memory address 2 * checker.locks.size() (=offset) is used to tell if this lock is locked
	// Global Memory address offset + 1 is used to tell which thread owns the lock
	
	
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
