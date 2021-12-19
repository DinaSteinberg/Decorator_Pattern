
public class HTag extends ConcreteHTMLTag{
	
	private int size;

	public HTag(String id, String name, String text) {
		super(id, name, text);
		size = 1;
	}
	
	public void setSize(int size) {
		if(size > 0 && size < 7) {
			this.size = size;
		}
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<h" + size);
		if(super.getId() != null)
			str.append(" id = \"" + super.getId() + "\" ");
		if(super.getName()!= null)
			str.append(" name = \"" + super.getName() + "\"");
		str.append(">" + getText() + "</h" + size + ">");
		return str.toString();
	}
	

}
