package ex04_this;
/*
 	this
	1. this는 객체 자신을 의미
	2. 내부에서만 사용합니다.
	3. 활용
		1) this.필드값 -> 가장 주된 사용
		2) this() -> 다른 생성자를 호출하는 것을 의미
		
*/
public class Car {
	
	//field
	String model;
	String manufacturer;
	int price;
	
	//method
	void set(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	void info() {
		System.out.println("모델명: " + model);
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격: " + price);
	}
	
	
}
