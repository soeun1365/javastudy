package ex01;

/*
  	스레드(thread)
  	1. 자바의 세부 작업 단위
  	2. 생성방법 (택 1)
  		1) Thread ->클래스를 상속 받습니다. (extends Thread인것)
  		2) Runnable 인터페이스를 구현합니다. (implements Runnable)
 	3. 기본규칙
 		1)run()메소드 : 스레드의 작업을 작성하는 메소드입니다. 오버라이드 해서 사용합니다.
 		2)start()메소드 : 스레드를 실행하느 메소드이니다. run()를 호출하지 않습니다.
 */

public class Person extends Thread {

	//field
	private String name;
	
	//constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//method
	public void eat() {
			System.out.println(name + "이(가) 먹는 중입니다.");
	}
	
	@Override	//소스메뉴 자동완성, run을 오버라이드
	public void run() {	//thread가 동작시키는 메소드
		for(int i = 0; i < 3 ; i ++) {
			eat();
		}
	}
}
