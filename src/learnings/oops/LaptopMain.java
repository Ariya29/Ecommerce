package learnings.oops;

public class LaptopMain {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Gray", "Windows", "Dell", 13.5, "Intel i7", "4GB");
		Laptop l2 = new Laptop("Black", "Windows", "MSI", 15.6, "Intel i7", "2GB");
		
		Shirt[] s1 = new Shirt[] { 
				new Shirt("Yellow", "Full Sleeve"),
				new Shirt("Blue", "Quarter Sleeve"),
				new Shirt("Pink", "Sleeveless")
			};
		
		
		Shirt[] s2 = new Shirt[] { 
				new Shirt("Red", "No Sleeve"),
				new Shirt("Black", "Full Sleeve")
			};
		
		Person p1 = new Person("Ariya", l1, s1);
		Person p2 = new Person("Potato", l2, s2);
		
		p1.watchMovie("Shrek 3");
		
		System.out.println();
		p2.watchMovie("Borat");
		
		System.out.println();
		p1.showWardrobe();
		
		System.out.println();
		p2.showWardrobe();
		
	}

}
