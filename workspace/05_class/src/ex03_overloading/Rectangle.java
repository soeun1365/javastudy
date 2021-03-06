package ex03_overloading;
/*
 	오버로딩(over-loading)
 	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미
 	2. 결과타입은 오버로딩과 상관이 없습니다. 같아도 되고, 달라도됨
 	
 */
	public class Rectangle {
	
	//field
	int width;		//-->0으로 초기화 되어있음 자바가 스스로
	int height;		//-->0으로 초기화 되어있음 자바가 스스로
	
	//method
	void set(int w, int h) {
			if(w > 0) {
				width = w;
			}
			if(h > 0) {
				height = h;
			}
		}
	
	//method
	void set(int n) {
		//다른 set() 메소드를 호출해서 처리합니다.
		set(n ,n );
	}
	
	//method
	int getArea() {
		return width * height;	
	}
}

