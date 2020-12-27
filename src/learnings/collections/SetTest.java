package learnings.collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetTest {

	// Does not allow duplicates
	// Not indexed
	
	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int b = scanner.nextInt();
			if (b == -999)
				break;
			a.add(b);
		}
		
		System.out.println(a);
		
		

	}

}
