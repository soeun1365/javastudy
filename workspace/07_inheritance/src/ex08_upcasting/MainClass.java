package ex08_upcasting;

import sun.rmi.runtime.NewThreadAction;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv(200, "LG-75");
		tv.info(); 			//Tv클래스의 info()를 호출
		
		Elec elec = tv;		//Tv 타입의 객체를 Elec타입으로 변경
							//서브 -> 슈퍼 타입으로 변경하는 것으로
							//"up-casting" 이라고 한다.
							//up-casting은 별도 casting문법이 없습니다.
							//그냥됩니다.
		
		elec.info();		//Elec클래스의 info()를 호출
							//Elec에는 모델은 없고 와트만 있지만
							//업캐스팅해서 나옴
		
		//////////////////////////////  메소드의 호출  //////////////////////////////
		//1. 객체의 타입에 따라 결정됩니다.
		// 	 호출할 메소드를 결졍하는 것을 "바인딩"이라고 표현합니다.
		//2. 자바는 "동적 바인딩"으로 메소드를 호출합니다.
		// 	 1)메소드 호출시점(실행전)에는 객체의 타입을 봅니다.
		//		Elec elec = tv;		이므로 elec.info 는 Elec의 info()입니다.
		//	 2)실제 객체를 확인합니다.
		//		Tv tv = new Tv(200,"Lg-75");	이므로 tv객체가 Tv클래스타입이라는 것을 확인합니다.
		//	 3)실제 객체의 타입으로 바꿔서 호출하고 실행합니다.
		//		elec.info()가 실해될때는 Tv의 info가 호출됩니다.
		
		//정리: 호출전에는 타입만 보고 elec의 info를 가져오지만,, 실제 작동할땐 실제객체를 확인하여
		//		Tv의 info()를 호출시켜 name과 와트가 다 나오게 됨
		
		Elec elec2 = new Tv(300, "samsung-85");		//흔히 up-casting을 이렇게 한번에 모아서 함
		elec2.info();
	}

}
