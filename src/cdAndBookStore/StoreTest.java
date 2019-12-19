package cdAndBookStore;

import java.util.Arrays;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = Store.getInstance();
		
		
		Book b1 = new Book(100, "Test", "Testy");
		Book b2 = new Book(120, "Tester", "Testies");
		CD c1 = new CD(50, "Music", "Makers");
		CD c2 = new CD(150, "Musics", "Makersers");
		CD c3 = new CD(250, "Musicing", "Makerssss");
		
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		store.addBook(b1);
		store.addBook(b2);
		store.addCD(c1);
		store.addCD(c2);
		store.addCD(c3);
		
		System.out.println(store.getBook(0));
		System.out.println(store.getBook(1));
		
	
		
		System.out.println(store.getBook(1));
		
		System.out.println(Arrays.toString(store.seeStoreItems()));
		
		
	/*	store.removeBook(1);
	*	store.removeCD(1);
	*	
	*	System.out.println(Arrays.toString(store.seeBooks()));
	*	System.out.println(Arrays.toString(store.seeCDs()));
	*/
	}

}
