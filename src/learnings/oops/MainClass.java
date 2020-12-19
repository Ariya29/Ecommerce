package learnings.oops;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
				
		p1.color = "Blue";
		p1.height = 15;
		p1.move();
		p1.showInfo();

		
		p2.color = "Red";
		p2.height = 25;
		p2.move();
		p2.showInfo();

		
		p3.color = "Pink";
		p3.height = 22;
		p3.move();
		p3.showInfo();
		
		Player p4 = p2;
		p4.color="gray";
		p2.showInfo();
		p4.showInfo();
	}

}
