package learnings.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


// 1. supports duplicate values
// 2. indexed

public class ListTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		while(true) {
			int b = scanner.nextInt();
			if (b == -999)
				break;
			a.add(b);
		}
		
		System.out.println(a);
		
		int sum = 0;
		
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		
		System.out.println("Sum: " + sum);
		
		System.out.println("Size: " + a.size());
		
		a.add(2, -5);
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		System.out.println("Contains 12: " + a.contains(12));
		
		ArrayList<Integer> numbersToFind = new ArrayList<Integer>();
		numbersToFind.add(10);
		numbersToFind.add(20);
		numbersToFind.add(30);
		
		System.out.println("Contains 10, 20, 30: " + a.containsAll(numbersToFind));
//		
//		a.clear();
//		System.out.println(a);
		
		a.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				return j - i;
			}
		});
		
		System.out.println(a);
		
		
		if (a.indexOf(12) == a.lastIndexOf(12))
			System.out.println(12 + " only 1 occurrence");
		else
			System.out.println("Multiple occurrences of 12 found");

	}

}
