package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Book b1 = new Book(1000, "어린왕자", "생택쥐베리");
		Book b2 = new Book(1001, "소나기", "황순원");
		Book b3 = new Book(1002, "홍길동전", "김홍길");
		
		Library library = new Library("신촌도서관");
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		
		library.booksinfo();
		
		library.removeBook(1002);
		
		library.booksinfo();

	}

}
