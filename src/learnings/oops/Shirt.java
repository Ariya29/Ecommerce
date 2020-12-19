package learnings.oops;

public class Shirt {

	private String color;
	private String sleeves;
	
	
	public Shirt(String color, String sleeves) {
		this.color = color;
		this.sleeves = sleeves;
	}



	@Override
	public String toString() {
		return color + " " + sleeves + " shirt";
	}
	
}
