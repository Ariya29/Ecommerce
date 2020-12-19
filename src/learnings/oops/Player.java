package learnings.oops;

// this is a class, which means it contains the
// blueprint of what characteristics a player
// should have

public class Player {

	// attributes
	String color;
	int height;
	
	// functionalities
	void move() {
		System.out.println("The player is moving");
	}
	
	void showInfo() {
		System.out.print("Information: ");
		System.out.print(color + " ");
		System.out.println(height);
	}
	
}
