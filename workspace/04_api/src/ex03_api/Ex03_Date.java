package ex03_api;

import java.sql.Date;			//sql임!!

public class Ex03_Date {

	public static void main(String[] args) {
		
		// java.sql.Date
		
		// 1. DB의 Data타입에 맞게끔 wrapping처리한 클래스입니다.
		
		long date = System.currentTimeMillis();
		Date today = new Date(date);	//자바내에서 쓰는걸 보는거라 안외워도 됨
		
		System.out.println(today);
		
	}

}
