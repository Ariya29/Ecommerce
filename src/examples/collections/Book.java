package examples.collections;

public class Book {

	private int id;
	private String title;
	private String author;
	private int price;
	
	public Book(int id, String title, String author, int price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	

	public String getTitle() {
		return title;
	}



	public String getAuthor() {
		return author;
	}



	public int getPrice() {
		return price;
	}
	
	public int getId() {
		return id;
	}

	
	@Override
	public boolean equals(Object k) {
		return this.id == ((Book)k).getId();		// type casting to convert the type of obj variable into a Book variable
	}
	
	
	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
}
