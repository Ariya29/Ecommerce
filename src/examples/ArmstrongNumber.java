package examples;

public class ArmstrongNumber {

	// the user enters a number n
	// if n is a 3 digit number, d1^3 + d2^3 + d3^3 == n itself, it is an armstrong number
	// if n is a d digit number, every digit raised to the power of d added up together should be the same number
	
	
	public static void main(String[] args) {
		
		// 153 = 1^3 + 5^3 + 3^3
		
		int number = 153;
		int originalNumber = number;
		int totalDigits = 0;
		
		// finding number of digits
		for (int power = 1; ; power += 1) {
			if (number % Math.pow(10, power) == number) {
				totalDigits += 1;
				break;
			}
			else {
				totalDigits += 1;
			}		
		}
		
		int sum = 0;
		
		for (int i =1; i <= totalDigits; i++) {
			int digit = (number % 10);
			sum += Math.pow(digit, totalDigits);
			number /= 10;
		}
		
		if (sum == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number ");
		} else {
			System.out.println(originalNumber + " is NOT an Armstrong number ");
		}
	}
}
