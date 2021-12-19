
public class InputTag extends ConcreteHTMLTag{
	
	private String type;
	private String event;
	private String value;
	
	public InputTag(String id, String name, String text) {
		super(id, name, text);
	}
	
	public void setEvent(String type, String event) {
		if(type!= "")
			this.type = type;
		if(event!= "")
			this.event = event;
	}
	
	public void setValue(String value) {
		if(value!= "")
			this.value = value;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<input");
		if(super.getId() != null)
			str.append(" id = \"" + super.getId() + "\"");
		if(super.getName()!= null)
			str.append(" name = \"" + super.getName() + "\"");
		if(type!= null)
			str.append(" type = \"" + type + "\"");
		if(event!= null)
			str.append(" event = \"" + event + "\"");
		if(value != null)
			str.append(" value = \"" + value + "\"");
		str.append(">" + getText() + "</input>");
		
		return  str.toString() ;
	}
	
	

}
