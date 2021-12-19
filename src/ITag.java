
public class ITag extends DecoratorHTMLTag{

	public ITag(String id, String name, Tag innerTag) {
		super(id, name, innerTag);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<i");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		str.append(">" + getInnerTag().toString() + "</i>");
		
		return str.toString();
	}
	
	

}
