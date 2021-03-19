package ex15_interface_extends;

//자바는 다중상속이 안된다, C++은됨
//다중상속은 문제점이 있음, 부모가 2개임

public class SmartPhone extends Phone implements Computable {	//이렇게 쓰면 다중상속같은 느낌으로 쓸 수 있음

	//Computable의 playApp()을 반드시 오버라이드 해야함
	//method
	@Override
	public void playApp() {
		System.out.println("앱을 실행한다.");
		
	}	
}
