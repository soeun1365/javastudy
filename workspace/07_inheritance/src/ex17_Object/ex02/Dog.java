package ex17_Object.ex02;

public class Dog {

	//field
	private String name;

	//constructor
	public Dog(String name) {	//Source메뉴에서 생성할때 보면 Super클래스에 Object써있는것 확인가능
		super();	//Object의 생성자 호출(생략해도 됩니다.)
		this.name = name;
	}

	//method
	//Object클래스의 toString()을 사용하지 않기 위해서
	//toString() 메소드를 오버라이드합니다.
	@Override
	public String toString() {
		
		return "[name: " + name + "]";
	}
	
}
