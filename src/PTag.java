
public class PTag extends ConcreteHTMLTag{

	public PTag(String id, String name, String text) {
		super(id, name, text);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<p");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		str.append(">" + getText() + "</p>");
		
		return str.toString();
		
	}

}
