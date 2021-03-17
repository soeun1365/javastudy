package ex06_override;

public class Espresso extends Coffee{
	//field
	private int water;
	
	//constructor		//자동완성하기
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	//method
	
	//Espresso 클래스는 이미 Coffee클래스의 메소드를 사용할 수 있습니다.
	//Espresso 클래스가 Coffee클래스의 taste 메소드를 사용하는것이 적절할까요?
	//NO
	//가능은 하지만 Espresso는 Coffee의 taste와 맞지 않음
	//Espresso클래스는 자신의 맛을 표현하기 위해서 새롭게 taste()메소드를 만드는 것이 좋습니다.
	//
	//메소드 오버라이드 (method override)
	//슈퍼클래스의 메소드를 사용하지 않기 위해서,
	//서브클래스가 메소드를 다시 만드는 것을 의미
	//
	//유사단어: 오버로딩과 오버라이드! 전혀다르므로 주의.
	
	//오버라이드 주의점
	//1. 똑같은 형태로 만듭니다. 똑같지 않으면 오버라이드가 아닙니다.
	//2. @Override 애너테이션(annotation)을 작성해줍니다. 자동완성가능
	//	1) 개발자가 자바에게 이 메소드는 오버라이드 하는 것이라고 알리는 것입니다.
	//	2) 그러면 자바는 오버라이드 규칙(똑같이 만들었는지)을 어겼을 경우 오류를 발생시켜 줍니다.
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만 맛은 약간 씁니다.");
	}
}
