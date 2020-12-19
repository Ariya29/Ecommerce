package examples;

public class ReversingAnArray {

	public static void main(String[] args) {
		
		int[] myArray = {1, 54, 98, 256, 1024, 2048};
		

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		
		for (int i = 0; i < myArray.length / 2; i++) {
			
			int temp = myArray[i];
			myArray[i] = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 - i] = temp;
		}
		
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		
	}
}
