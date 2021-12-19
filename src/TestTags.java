
public class TestTags {

	public static void main(String[] args) {
		Tag a = new DivTag("div", "newDiv", "This is a sample div");
		a = new SmallTag(null, null, a);
		
		Tag b = new InputTag("field", "abc", "Enter your name");
		((InputTag) b).setEvent("onclick", "load");
		b = new EmTag("", "ice cream", b);
		b = new StrongTag("candy", null, b);
		b = new ITag("bTag", "ice cream", b);
		
		Tag c = new HTag(null, "abc", "This is a linked header");
		((HTag) c).setSize(4);
		c = new UTag("", "ice cream", c);
		c = new ATag("cTag", null, c);
		//((ATag)a).setHref("https://touro.instructure.com/?login_success=1");
		
		Tag d = new PTag("", "par", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod "
				+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure ");
		d = new EmTag(null, null, d);
		d = new StrongTag(null, null, d);
		d = new SmallTag("", "", d);
		d = new ITag("", "", d);
		d = new UTag("", "", d);
		d = new ATag("dTag", "", d);
		//((ATag)d).setHref("https://www.amazon.com/");
		
		System.out.println(a.toString() + "\n");
		System.out.println(b.toString() + "\n");
		System.out.println(c.toString() + "\n");
		System.out.println(d.toString() + "\n");

	}

}
