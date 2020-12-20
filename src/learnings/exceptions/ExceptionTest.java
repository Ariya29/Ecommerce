package learnings.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		while(true) {
		
			System.out.println("Enter two numbers:");
			try {
				System.out.println("1st number");
				int a = scanner.nextInt();
				
				System.out.println("2nd number");
				int b = scanner.nextInt();
			
				int c = calc.add(a, b);
				System.out.println(c);
				
				int d = calc.sub(a, b);
				System.out.println(d);
				
				int e = calc.mul(a, b);
				System.out.println(e); 
	
				int f = calc.div(a, b);
				System.out.println(f);
				
			}
			catch(ArithmeticException ex) {}
			catch(InputMismatchException ex) {
				System.out.println("Please enter Integers only");
				scanner.nextLine();
			}
			finally {
				System.out.println("Iteration done");
			}
		}
		
	}

}
