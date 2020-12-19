package examples;

public class Fibonacci {

	// f s c
	//   f s c
	//     f s c
	// 0 1 1 2 3 5 8 13 21 ...
	
	public static void main(String[] args) {
		
		int terms = 10;
		
		int firstNum = 0;
		int secondNum = 1;
		
		int sum=0;
		
		System.out.print(firstNum + " " + secondNum + " ");
		for (int i = 3; i<= terms; i++) {
			int currentNumber = firstNum + secondNum;
			System.out.print(currentNumber + " ");
			firstNum = secondNum;
			secondNum = currentNumber;
			sum+=currentNumber; 
		}
		System.out.println("\nThe sum of these digits is " + sum);
	}
}
