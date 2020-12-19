package learnings;

public class JustAClass {

	public static void main(String[] args) {
		
//		int a;	// declaration
//		int b;
//		
//		
//		a = 5;	// definition
//		b = 10;
//		
//		int c = 15;		// in-line initialization
//		
//		System.out.println(c);
//		
//		int p, q, r;	// declaration
//		
//		p = 10;
//		q = 15;
//		
////          expression
////		assignment
//		r = p + q;    // statement (ends with a ;)
//		
//		System.out.println(r);
		
		
		// Numeric Operations
		
		int a = -4;
		int b = 10;
		
		int sum = a + b;
		int dif = a - b;
		int pro = a * b;
		double quo = (double) a / (double) b;			// typecasting
		double exp = Math.pow(a, b);
		int absolute_a = Math.abs(a);
		
		System.out.println("Sum of " + a + " and " + b + " is : " + sum); // Sum of 4 and 2 is 6
		System.out.println("Dif of " + a + " and " + b + " is : " + dif);
		System.out.println("Pro of " + a + " and " + b + " is : " + pro);
		System.out.println("Quo of " + a + " and " + b + " is : " + quo);
		System.out.println("Exp of " + a + " and " + b + " is : " + exp);
		System.out.println("Abs of " + a + " is : " + absolute_a);
		
		
		// logical AND operation
		
		boolean b1 = true && true;		// true
		boolean b2 = true && false;		// false
		boolean b3 = false && false;	// false
		
		// logical OR operation
		
		boolean b4 = true || true;		// true
		boolean b5 = true || false;		// true
		boolean b6 = false || false;	// false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		
		// multi datatype printing
		
		String s = "We have an integer that says " + b + " and a boolean that says " + b3 + " and all of them came into perfect harmony using this String!";
		System.out.println(s);
		
		String s3 = b4 + "" + a;		// good example of bringing in harmony among the differences;

	}

}
