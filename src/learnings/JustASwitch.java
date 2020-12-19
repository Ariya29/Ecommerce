package learnings;
import java.util.Scanner;

public class JustASwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter the Second number: ");
		double b = scanner.nextDouble();
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.print("Your Choice: ");
		int choice = scanner.nextInt();
		
		scanner.close();		
		
		switch (choice) {
		
		case 1:
			double sum = a + b;
			System.out.println("Sum of " + a + " and " + b + " is : " + sum);
			break;
			
		case 2:
			double dif = a - b;
			System.out.println("Dif of " + a + " and " + b + " is : " + dif);
			break;
			
		case 3:
			double pro = a * b;
			System.out.println("Pro of " + a + " and " + b + " is : " + pro);
			break;
			
		case 4:
			double quo = a / b;
			System.out.println("Quo of " + a + " and " + b + " is : " + quo);
			break;
			
		default:
			System.out.println("Your choice is invalid.");
		}
		
	}

}
