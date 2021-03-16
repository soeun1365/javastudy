package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.title = "선녀와 나무꾼"; 
		b1.writter = "안소은";
		b1.price = 10000;
		b1.stock = 10;
		
		Calendar date = Calendar.getInstance();
		date.set(2017,8,5);
		long timestamp = date.getTimeInMillis();
		b1.pubDate = new Date(timestamp);
		
		b1.isBest = true;
		
		System.out.println("[" + b1.title + "]" + " 책의 저자는 " + b1.writter + "입니다. 가격은" + b1.price + "원입니다.");
		System.out.println("재고량: " + b1.stock + ", 출시일: " + b1.pubDate);
		System.out.println(	b1.isBest ? "베스트셀러입니다." : "베스트셀러는 아닙니다.");
		
	}

}
