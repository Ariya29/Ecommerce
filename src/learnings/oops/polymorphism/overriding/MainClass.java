package learnings.oops.polymorphism.overriding;

public class MainClass {

	public static void main(String[] args) {
		
//		Car c = new Car();
//		Bike b = new Bike();
//		
//		c.applyBrakes();
//		c.move(75);
//		
//		b.applyBrakes();
//		b.move(45);
		
//		Vehicle v;
//		
//		v = new Car();
//		
//		
//		v = new Bike();
//		v.applyBrakes();
		
		Bike b1 = new Bike(150, "Regular Bike");
		Bike b2 = new Bike(180, "Sports Bike");
		
		Car c1 = new Car(800, "Suzuki Car");
		
		Vehicle winner = VehicleComparator.compare(b1, c1);
		System.out.println(winner.getName());
		
	}
}
