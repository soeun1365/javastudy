package quiz06;

public class Book {

	//field
	String title;
	String writter;
	int price;
	
	//constructor
	Book(String title, String writter, int price){
		this.title = title;
		this.writter = writter;
		this.price = price;
	}
	Book(String title, int price){
		this(title, "미상", 10000);
	}
	Book(){
			this("없음", "미상", 0);
			//this("없음", 0)	 이렇게 써도 무관
		}
	void info(){
		System.out.println("제목: "+ title + ", 저자: " + writter + ", 가격: "  + price);
	}
	
}
