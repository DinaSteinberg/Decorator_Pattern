
public class EmTag extends DecoratorHTMLTag {

	public EmTag(String id, String name, Tag innerTag) {
		super(id, name, innerTag);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<em");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		str.append(">" + getInnerTag().toString() + "</em>");
		
		return str.toString();
	}

}
