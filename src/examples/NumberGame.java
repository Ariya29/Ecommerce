package examples;

import java.util.Scanner;

public class NumberGame {

	// the user has to enter a number
	// if that number is a prime number, we add +3.5 to the score of the user
	// if it is not prime and even number, we add -2.5 to the score of the user
	// if it is not prime and odd number, we add -1.5 to the score of the user
	// if it is a 0, we add 0 to the score of the user
	// there has to be a random number between 2 and 5, if the user entered number
	// matches that, we wanna credit +100 points to the score
	// if the user gives -99 we would exit the game
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = 0;

		
		int number_before = 0, number_before_2 = 0;
		
		
		while (true) {
		
			System.out.print("Input: ");
			int number = scanner.nextInt();
			
			if (number == number_before && number_before == number_before_2) {
				System.out.println("You cannot enter the same number 3 times at a row");
				continue;
			}
			
			if (number == -99) {
				break;
			}
			
			boolean isPrime = true;
			
			for (int d = 2; d < number; d += 1) {
				if (number % d == 0) {
					isPrime = false;
					break;
				}
			}
			if (number == (Math.random() + 2) * 1.5 ) {
				score += 100;
			}
			else if (number == 0) {
				score += 0;
			}
			else if (isPrime) {
				score += 3.5;
			}
			else if (!isPrime && number % 2 == 0) {
				score += -2.5;
			}
			else if (!isPrime && number % 2 == 1) {
				score += -1.5;
			}

			System.out.println("Your score is: " + score);
			
			number_before_2 = number_before;
			number_before = number;
		}
	}
	
	
	
}
