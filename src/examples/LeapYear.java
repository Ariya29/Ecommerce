package examples;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a year of your choice: ");
		int year = scanner.nextInt();
		
		scanner.close();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is NOT a Leap Year");
		}
	}
}
