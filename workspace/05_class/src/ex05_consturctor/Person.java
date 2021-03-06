package ex05_consturctor;

/*	생성자(constructor)
 	1. 객체를 생성하는 메소드입니다.
 	2. 특징
 		1) 결과타입: 존재하지 않습니다. 아예 작성하지를 않습니다.
 		2) 메소드명: 클래스명과 같습니다.
 		3) 매개변수: 일반 메소드처럼 사용합니다.
 	3. 호출시점
 		: 객체를 생성하기 위해서 new를 호출하면 그 때 호출됩니다. 다른경우에 부를 수 없음.
 */

/*
 	객체생성								생성자
 	Person p = new Person();				Person(){  ...  }
 	Person p = new Person("james")			Person(String name){  ...  }
 	person p = new Person("ali", 20)		Person(String name, int age){  ...  }
 */

public class Person {

	//field
	String name;
	int age;
	char geneder;
	
	//constructor
	Person(String name, int age, char geneder){
		this.name = name;
		this.age = age;
		this.geneder = geneder;
	}
	Person(String name){
		this(name, 0, '\0');	//이 줄의 this는 매개변수 세개 받는 constructor를 찾음
	}							//통상 이렇게 쓰지는 않지만 학습용으로 연습
	Person(String name, int age){
		this(name, age, '\0');
	}
	Person(){
		this(null, 0, '\0');
	}
	
}
