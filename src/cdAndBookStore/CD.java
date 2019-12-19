package cdAndBookStore;

public class CD extends Item{

	private String band;
	
	public CD() {
		
	}
	
	public CD(double price, String title, String band) {
		super(price, title);
		setBand(band);
	}
	
	
	public void setBand(String band) {
		this.band = band;
	}
	
	public String getBand() {
		return band;
	}
	

	@Override
	public String toString() {
		String cdToString = "CD[" + "Title: " + getTitle() + ", Band: " + band + ", Price: " + getPrice() + "]";
		return cdToString;
		
	}

}
