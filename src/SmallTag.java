
public class SmallTag extends DecoratorHTMLTag{

	public SmallTag(String id, String name, Tag innerTag) {
		super(id, name, innerTag);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<small");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		str.append(">" + getInnerTag().toString() + "</small>");
		
		return str.toString();
	}
	
	

}
