package ex11_abstract;

//1. 추상메소드
//		1)본문이 없는 메소드입니다.
//		2)메소드를 정의할 때 abstract 키워드를 앞에 추가합니다.
//		3)중괄호{} 를 빼고, 세미콜론;을 붙인다.
//2. 추상클래스
//		1)추상메소드가 1개이상 포함된 클래스, 추상메소드가 있으면 추상클래스임
//		2)추상클래스는 추상클래스 앞에 abstract 키워드를 추가해준다.
public abstract class  Staff {		//abstract public class  Staff {	이 순서도 가능

	//field
	private String name;

	//constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	//method
	public void info() {
		System.out.println("직원명: " + name);
	}
	/*
	public int getPay() {
		return ? 	//반환할수있는 값이 없다...
	}
	*/
	//이럴땐 본문이 없는 getPay() 메소드를 만들면 됩니다.
	//	=> 추상메소드를 사용하자	
	public abstract int getPay();	//abstract public int getPay();		이 순서도 가능

}
