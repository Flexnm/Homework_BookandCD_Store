package cdAndBookStore;

import java.util.Arrays;

public class Store implements GenericStore{
	
//	private CD[] disks = new CD[10];
//	private Book[] books = new Book[10];
	private static Store instance = new Store(); // Singleton initialization
	
	private Item[] items  = new Item[10];
	
	private Store() { // Private CTOR for singleton
	
	}
	
	public static Store getInstance() { // The getInstance to be able to call for the store in the test.
		return instance;
	}
	
	// methods:
	// addBook, addCD.
	// removeBook, removeCD.
	// getBook, getCD. - return toString().
	// seeBooks, seeCDs - return arrays
	
	// Books methods:
	public void addBook(Book newBook) {
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = newBook;
				return;
			}
		}
	}
	
	public void removeBook(int bookIndex) {
		if(bookIndex < items.length && items[bookIndex] instanceof Book) {
			items[bookIndex] = null;
			return;
		} else {
			System.out.println("Invalid index: no book found on index to remove.");
			return;
		}
	}
	
	/* public void removeBook(int bookIndex) {
	*	for (int i = 0; i < items.length; i++) {
	*		if(bookIndex < items.length && items[bookIndex] != null) {
	*			if(bookIndex == i) {
	*				items[bookIndex] = null;
	*				return;
	*			}
	*		} else {
	*			System.out.println("Invalid index: no book found on index to remove.");
	*			return;
	*		}
	*	}
	*}
	*/
	public String getBook(int bookIndex) {
		if(bookIndex < items.length && items[bookIndex] != null) {
		return items[bookIndex].toString();
		} else {
			return "Invalid index: no book information was found on index.";
		}
	}
	// CD methods:
	public void addCD(CD newCD) {
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = newCD;
				return;
			}
		}
	}
	
	public void removeCD(int CDIndex) {
		if(CDIndex < items.length && items[CDIndex] instanceof CD) {
			items[CDIndex] = null;
			return;
		} else {
			System.out.println("Invalid index: no CD found on index to remove.");
			return;
		}
	}
	
	/* public void removeCD(int CDIndex) {
	*	for (int i = 0; i < items.length; i++) {
	*		if(CDIndex < items.length && items[CDIndex] != null) {
	*			if(CDIndex == i) {
	*				items[CDIndex] = null;
	*				return;
	*			}
	*		} else {
	*			System.out.println("Invalid index: no CD found on index to remove.");
	*			return;
	*		}
	*	}
	*}
	*/
	public String getCD(int CDIndex) {
		if(CDIndex < items.length && items[CDIndex] != null) {
			return items[CDIndex].toString();
			} else {
				return "Invalid index: no CD information was found on index.";
			}
	}
	
	// Store methods:
	
/*	public Item[] seeStoreItems() {
*		return items;
*	}
*/	
	public void seeStoreItems() {
		System.out.println(Arrays.toString(items)); // More efficient way shown to me by Peleg.
		return;
	}

}
