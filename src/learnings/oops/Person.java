package learnings.oops;

public class Person {

	private String name;
	private Laptop laptop;
	private Shirt[] shirts;
	
	public Person(String name, Laptop laptop, Shirt[] shirts) {
		this.name = name;
		this.laptop = laptop;
		this.shirts = shirts;
	}
	
	public void watchMovie(String movie) {
		System.out.println(this.name + " is watching " + movie + " on " + laptop.getColor() + " " + laptop.getBrand() + " laptop");
	}
	
	public void showWardrobe() {
		System.out.println("Shirts " + name + " has: ");
		for (int i = 0; i < shirts.length; i++) {
			System.out.println((i+1) + ". " + shirts[i]);
		}
	}
}
