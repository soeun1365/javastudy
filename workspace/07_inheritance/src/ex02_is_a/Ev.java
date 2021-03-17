package ex02_is_a;

//전기차 Ev
// Ev is a Car관계가 성립합니다.

public class Ev extends Car{

	public void charging() {
		System.out.println("충전");
	}
}
