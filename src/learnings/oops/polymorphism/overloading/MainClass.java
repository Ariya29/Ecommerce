package learnings.oops.polymorphism.overloading;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(15, 30);
		c.add(55.98, 45.1101);
		c.add(1, 2, 3);
		c.add(new int[] {12,  56, 33}, new int[] {33, 78});
	}

}
