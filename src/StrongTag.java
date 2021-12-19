
public class StrongTag extends DecoratorHTMLTag{

	public StrongTag(String id, String name, Tag innerTag) {
		super(id, name, innerTag);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<strong");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		str.append(">" + getInnerTag().toString() + "</strong>");
		
		return str.toString();
				
	}
	
	

}
