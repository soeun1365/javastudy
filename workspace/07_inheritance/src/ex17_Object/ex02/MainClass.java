package ex17_Object.ex02;

public class MainClass {

	public static void main(String[] args) {
		
		Dog dog = new Dog("댕댕이");
		
		System.out.println(dog);
		System.out.println(dog.toString());	//위와같은 코드

		//Object 클래스의 toString()
		/*
		  	public String toString(){
		  		return getClass().getName() + @ + hashCode();	//클래스@메모리 참조값
		  	}
		 */
	}

}
