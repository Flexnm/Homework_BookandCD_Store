package cdAndBookStore;

public interface GenericStore {
	
	void addBook(Book newBook);
	void removeBook(int bookIndex);
	String getBook(int bookIndex);
	void addCD(CD newCD);
	void removeCD(int CDIndex);
	 String getCD(int CDIndex);
	 Item[] seeStoreItems();

}
