package examples;

public class FiboWithArrays {

	public static void main(String[] args) {
		
		int terms = 15;
		
		int[] fiboArray = new int[15];
		
		fiboArray[0] = 0;
		fiboArray[1] = 1;
		
		for (int i = 2 ; i < terms; i++) {
			fiboArray[i] = fiboArray[i-1] + fiboArray[i - 2];
		}
		
		// reverse printing of fibo array
		
		for (int i = fiboArray.length - 1; i >= 0; i--) {
			System.out.println(fiboArray[i]);
		}
		
	}
}
