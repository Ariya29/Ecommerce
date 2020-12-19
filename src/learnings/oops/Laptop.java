package learnings.oops;

public class Laptop {
	
	private String color;
	private String OS;
	private String brand;
	private double screensize;
	private String cpu;
	private String gfx;
	
	// constructor:  has the same name as of the Class
	//				 has no return type at all
	//			     it may or may not have parameters
	//				 it automatically gets called during object creation
	
	public Laptop(String c, String o, String b, double s, String cp, String g) {
		color = c;
		OS = o;
		brand = b;
		screensize = s;
		cpu = cp;
		gfx = g;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void showDetails() {
		System.out.println("Color: " + color);
		System.out.println("OS: " + OS);
		System.out.println("Brand: " + brand);
		System.out.println("Screen Size: " + screensize);
		System.out.println("CPU: " + cpu);
		System.out.println("Graphics: " + gfx);
	}
	

}
