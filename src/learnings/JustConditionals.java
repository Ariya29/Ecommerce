package learnings;
import java.util.Scanner;

public class JustConditionals {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Give me some info on your Primary Character");
//		
//		System.out.println("First Name: ");
//		String fname = scanner.nextLine();
//		
//		System.out.println("Last name:");
//		String lname = scanner.nextLine();
//		
//		if (fname.equals("Patrick") && lname.equals("Jane")) { 
//			System.out.println("This must the The Mentalist, and I'm wathching that!!!");
//		}
//		else {
//			System.out.println("I wouldn't probably watch it");
//		}
		
		
		System.out.println("Tell me how the weather is like:");
		
		System.out.print("Is it raining (true/false)");
		boolean raining = scanner.nextBoolean();
		

		System.out.print("Is it too sunny (true/false)");
		boolean tooSunny = scanner.nextBoolean();
		
		if (raining || tooSunny) {
			System.out.println("We need to use the umbrella");
		}
		else {
			System.out.println("We do not need the umbrella");
		}
		
		
		
	}

}
