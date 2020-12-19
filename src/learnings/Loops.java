package learnings;

public class Loops {

	public static void main(String[] args) {
		
		// while is a looping if
		
		int n = 1;	// initialization
		
		while(n <= 20) {		// condition
			System.out.println(n*n);
			n += 1;				// update
		}
		
		System.out.println("Exiting..");
		
		int j = 20;		// init
		
		while (j >= 0) {		// condition
			System.out.println(j);
			j -= 5;			//update
		}

	}

}
