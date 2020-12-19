package examples;

public class ListOfArmStorngWithinRange {

	public static void main(String[] args) {
		
		int range = 99999999;
		
		for (int index = 1; index <= range; index += 1) {
			
			int number = index;
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
				System.out.println(originalNumber);
			}
		}
	}
}
