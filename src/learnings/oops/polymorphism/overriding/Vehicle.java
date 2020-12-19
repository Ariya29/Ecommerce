package learnings.oops.polymorphism.overriding;

public class Vehicle {

	private int engineCapacity;
	private String name;
	
	public Vehicle(int engineCapacity, String name) {
		this.engineCapacity = engineCapacity;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void move(int speed) {
		System.out.println("The vehicle is moving at " + speed + " mph");
	}
	
	public void applyBrakes() {
		System.out.println("The vehicle is decelerating");
	}
}
