package examples.collections;

import java.util.HashSet;

public class DuplicateDropping {

	public static void main(String[] args) {
		
		int[] myArray = {12, 456, 3,56,2,4,1,4,5,7,12,4,4,4,4,3,3,21,4,3,55,65,76,67,87,5,64,534,423,42,32,3};
		int[] duplicateRemovedArray = duplicateDeletor(myArray);
		
		printArray(myArray);
		printArray(duplicateRemovedArray);
		
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	public static int[] duplicateDeletor(int[] myArray) {
		HashSet<Integer> s = new HashSet<Integer>();
		
		for (int i = 0; i < myArray.length; i++)
			 s.add(myArray[i]);
		
		
		int [] newArray = new int[s.size()];
		int index = 0;
		for (int item : s)
			newArray[index++] = item;
		
		return newArray;
	}
}
