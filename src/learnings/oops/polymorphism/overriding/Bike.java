package learnings.oops.polymorphism.overriding;

public class Bike extends Vehicle {

	
	public Bike(int engineCapacity, String name) {
		super(engineCapacity, name);
	}

	@Override
	public void applyBrakes() {
		System.out.println("The rear brakes are applied");
	}
	
	public void changeGear() {
		System.out.println("CHanging gear!!");
	}
}
