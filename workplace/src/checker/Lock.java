package checker;

public class Lock {
	
	private final String id;
	private final int offset;
//	private boolean locked;
	
	public Lock(String id, int offset){
		this.id = id;
		this.offset = offset;
//		locked = false;
	}
	
	
//	public boolean LockLock(){
//		if(locked){
//			return false;
//		} else {
//			locked = true;
//			return true;
//		}
//	}
//	
//	public boolean UnlockLock(){
//		if(!locked){
//			return false;
//		} else {
//			locked = false;
//			return true;
//		}
//	}
	
	
	
	public String getName(){
		return id;
	}
	
	public int getOffset(){
		return offset;
	}
	
//	public boolean isLocked(){
//		return locked;
//	}
	

}
