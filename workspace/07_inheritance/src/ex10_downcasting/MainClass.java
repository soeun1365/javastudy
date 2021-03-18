package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {
		//자바는
		//컴파일(문법 오류 찾고 메모리 할당) -> 실행F11 (new가 처리됨) 
		 Person p1;
		 p1 = new Student();
		 
		 p1.eat();
		 p1.sleep();
		 //p1.study();		//Person p1 만 보고 호출할 메소드를 결정하기 때문에 불가능합니다.
		 
		 //p1을 Student타입으로 변경하면 해결됩니다.
		 //1. (Student)p1			:	p1을 Student로 캐스팅한다. (down-casting)
		 //2. (Student)p1.study		:	정상 동작하지 않습니다.
		 //   							연산자 최우선 순위는 마침표(.) 이기 때문에 마침표(.) 앞에 괄호로 싸줘야한다.
		 // 							-->((Student)p1).study();		: 캐스팅을 먼저 처리하고나서 study의 호출이 가능
		 ((Student)p1).study();
		 
		 System.out.println("============");
		 Person p2 = new Worker();
		 p2.eat();
		 p2.sleep();
		 ((Worker)p2).work();
		 
		 //실수를 해봅시다.
		 Person p3 = new Student();
		 p3.eat();
		 p3.sleep();
		// ((Worker)p3).work();	//ClassCastException 발생
		 						//Student와 Worker사이에 상속관계가 아니기 때문 
		 System.out.println("============");
		 
		 //타입을 확인나 뒤 캐스팅 할 수 있습니다.
		 //p3가 Student이면 Student로 캐스팅하고,
		 //p3가 Worker이면 Worker로 캐스팅하시오.
		 //그렇게 자주 사용되지는 않음, 실무에서는 어디 객체인지 확실하고 변하지도 않기 때문
		 if(p3 instanceof Student) {		//p3이 어디 객체인지 확인하는 코드 <<< instanceof >>>>
			 ((Student)p3).study();
		 }else if(p3 instanceof Worker) {
			 ((Worker)p3).work();
		 }
	}

}
