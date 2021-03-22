package ex17_Object.ex01;

public class MainClass {

	//Object 클래스
	//1. 모든 클래스들의 최상위 슈퍼클래스입니다.
	//2. extends처리는 하지 않습니다.
	//3. 모든 데이터는 Object에 저장 할 수 있습니다. 
	
	public static void main(String[] args) {
		
		Object obj1 = 1;
		Object obj2 = 1.5;
		Object obj3 = new Dog();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//Object에 저장된 객체는
		//캐스팅한 뒤 사용합니다.
		((Dog)obj3).move();
	}

}
