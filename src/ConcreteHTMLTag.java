
public abstract class ConcreteHTMLTag extends Tag{
	
	private String text;

	public ConcreteHTMLTag(String id, String name, String text) {
		super(id, name);
		this.setText(text);
	}

	@Override
	public abstract String toString();
	
	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
