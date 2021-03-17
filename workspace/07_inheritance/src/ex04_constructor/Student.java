package ex04_constructor;

//서브클래스 (자식클래스)
//부모가 먼저 태어나야 자식도 태어날 수 있습니다.
//서브클래스의 생성자는 슈퍼클래스의 생성자를 "!!!!!!!!반드시!!!!!!!"
//!!!!!!!!!!!먼저!!!!!!!!!!! 호출해야 합니다.
//생략이 가능한 경우는 슈퍼클래스의 생성자가 "디폴트 생성자"(전달되는 매개변수 없을때 ) 형태일 때 가능합니다.

//슈퍼클래스 키워드
//super : 슈퍼클래스의 참조값
//1. super.멤버 : super.필드, super.메소드()
//2. super() : 슈퍼클래스의 생성자를 호출

public class Student extends Person{

	//field
	private String school;
	
	//constructor
	public Student(String name, String school) {
		super(name);
		this.school = school;
	}
	
	//method
	public void info() {
		System.out.println("이름: " + getName());
		System.out.println("학교: " + school);
	}
	
}
