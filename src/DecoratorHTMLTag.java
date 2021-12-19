
public abstract class DecoratorHTMLTag extends Tag{
	
	private Tag innerTag;

	public DecoratorHTMLTag(String id, String name, Tag innerTag) {
		super(id, name);
		this.innerTag = innerTag;
	}

	@Override
	public abstract String toString();

	public Tag getInnerTag() {
		return innerTag;
	}

}
