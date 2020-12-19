package examples;

import java.util.Scanner;

public class CountingOddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Starting at: ");
		int start = scanner.nextInt();		// 10
		
		System.out.print("Upto: ");
		int end = scanner.nextInt();		// 18
		
		int n = start;		// 10
		int counter = 0;
		while(n <= end) {
			
			if (n % 2 == 1) {
//				System.out.println(n);
				counter += 1;
			}
			
			n += 1;
		}
		
		System.out.println("Total odd numbers: " + counter);
		
	}
}
