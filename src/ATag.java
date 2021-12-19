
public class ATag extends DecoratorHTMLTag{
	
	private String url;

	public ATag(String id, String name, Tag innerTag) {
		super(id, name, innerTag);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<a");
		if(super.getId() != null)
			str.append(" id = \""+ super.getId() +"\"");
		if(super.getName() != null)
			str.append(" name = \"" + super.getName() +"\"");
		if(url != null)
			str.append(" href= \"" + url + "\"");
		str.append(">" + getInnerTag().toString() + "</a>");
		
		return str.toString();
	}
	
	public void setHref(String url) {
		this.url = url;
	}
	
	

}
