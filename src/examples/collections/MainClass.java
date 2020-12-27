package examples.collections;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book(1000, "Maths", "Harry", 15));
		books.add(new Book(1001, "Science", "Rahul", 22));
		books.add(new Book(1001, "Science", "Rahul", 22));
		books.add(new Book(150, "English", "Michael", 17));
		books.add(new Book(112, "Env Sc", "Monalisa", 22));
		
		Student s1 = new Student("Bhagat", books);
		
		System.out.println(s1.getBooks());
		
		s1.sortBooksByPrices();
		
		System.out.println(s1.getBooks());
		
		System.out.println(s1.amountSpentOnBooks());
		
		System.out.println(s1.ifDuplicateBooks());
		

	}

}
