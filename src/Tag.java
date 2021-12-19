
public abstract class Tag {
	
	public String name;
	public String id;
	
	public Tag(String id, String name) {
		if(id!= "")
			this.id = id;
		if(name != "")
			this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public abstract String toString();

}
