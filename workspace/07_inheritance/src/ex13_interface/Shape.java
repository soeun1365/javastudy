package ex13_interface;

//interface
//1. 모든 메소드가 추상메소드인 클래스
//2. jdk 1.8 이후에 default 메소드와 static 메소드를 가질 수 있습니다.
//3. 모든 필드는 final 상수를 가집니다.

public interface Shape {	//interface는 조건만 맞다면 abstract class와 같다

	//field
	
	
	//method 모든 도형은 크기가 있다. (추상메소드 생성)
	public abstract double getArea();	//interface는 public abstract를 생략해도 자동으로 삽입되서 처리됩니다. ★★★★★
	
}
