package examples.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Student {

	private String name;
	private List<Book> books;
	
	public Student(String name, List<Book> books) {
		this.name = name;
		this.books = books;
	}
	
	public void sortBooksByPrices() {

		this.books.sort(new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				return b1.getPrice() - b2.getPrice();
			}
		});
	}
	
	public int amountSpentOnBooks() {
		int sum = 0;
		for (Book b : this.books) {
			sum += b.getPrice();
		}
		return sum;
	}
	
	public boolean ifDuplicateBooks() {
		return !(this.books.size() == new HashSet<Book>(this.books).size());
	}

	public String getName() {
		return name;
	}

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", books=" + books + "]";
	}
}
