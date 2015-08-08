package generator.sprockellModel.operands;

public class Label {
	private final String name;
	
	public Label(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o){
		if (!(o instanceof Label)){
			return false;
		}
		Label labelO = (Label) o;
		
		return name.equals(labelO.getName());
	}

}
