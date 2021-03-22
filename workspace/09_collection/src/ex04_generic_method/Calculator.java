package ex04_generic_method;

public class Calculator {

	//method
	public <T> double getTotal1(T[] a) {	// T타입의 배열 a를 받아오겠다
		double total = 0.0;
		for(int i = 0; i <a.length ; i++) {
			total += ((Number)a[i]).doubleValue();
			
		}
		return total;
	}
	
	
	public <T extends Number> double getTotal2(T[] a) {	//T는Number를 상속받는 클래스만 가능합니다.
		double total = 0.0;
		for(int i = 0; i <a.length ; i++) {
			total += a[i].doubleValue();
			
		}
		return total;
	}
}
