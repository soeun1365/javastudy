package ex03_api;
/*
  	wrapper class (어떤 클래스들의 그룹)
  	1.primitive type -> reference type 변경해주는 클래스
  	2.변수 -> 객체로 변경해주는 클래스입니다.
  	3.종류
  		1) int 		-> 	integer
  		2) long 	-> 	Long
  		3) double 	-> 	Double
  		4) char 	-> 	Character
  		5) boolean	-> 	Boolean
  	4.용어
  		1)Auto - Boxing: primitive타입의 값 		-> 	reference type의 객체로 바꿔줌
  		2)Auto - UnBoxing: reference type의 객체 	->	primitive 타입의 값으로 바꿔줌
 */
public class Ex06_Wrapper_class {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer("20");	//숫자로 되어있는 문자열
		Integer c = 30;		// 별도의 코드 없이도 Auto-Boxing
		
		int total = a+b+c;
		System.out.println(total); 		//Auto-UnBoxing
	}

}
