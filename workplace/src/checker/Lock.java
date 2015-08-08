package checker;

public class Lock {
	
	private final String id;
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
	
//	public boolean isLocked(){
//		return locked;
//	}
	

}
