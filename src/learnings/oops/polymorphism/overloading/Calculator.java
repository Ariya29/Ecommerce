package learnings.oops.polymorphism.overloading;

public class Calculator {

	// method overloading  -  multiple methods with same name and different parameters
	
	public void add(int a, int b) {		// add(int, int)
		int c = a + b;
		System.out.println(c);
	}
	
	public void add(int m, int n, int o) {	// add(int, int, int)
		int p = m + n + o;
		System.out.println(p);
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public void add(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		int c_index = 0;
		
		for(int i = 0; i < a.length; i++) {
			c[c_index] = a[i];
			c_index++;
		}
		
		for (int i = 0; i < b.length; i++) {
			c[c_index] = b[i];
			c_index++;
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}
}
