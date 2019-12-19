package cdAndBookStore;

public class Item {
	
	private double price;
	private String title;
	
	public Item(double price, String title) {
		setPrice(price);
		setTitle(title);
	}
	
	public Item() {
		
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	

}
