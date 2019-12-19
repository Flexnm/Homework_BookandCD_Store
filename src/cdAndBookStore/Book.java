package cdAndBookStore;

public class Book extends Item{
	
	
	private String author;
	
	public Book() {
		
	}
	
	public Book(double price, String title, String author) {
		super(price, title);
		setAuthor(author);
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		String bookToString = "Book[" + "Title: " + getTitle() + ", Author: " + author + ", Price: " + getPrice() + "]";
		return bookToString;
	}

}
