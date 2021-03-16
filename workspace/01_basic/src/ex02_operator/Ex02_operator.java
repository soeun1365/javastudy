package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
	//4. 관계연산자: >, >=, <, <=, ==, !=
		//결과의 타입은 boolean입니다. T/F
		
		int age = 20;
		boolean isAdult = age >= 20;
		
		System.out.println(isAdult);	//true 또는 false
		System.out.println();
		
	//5. 논리 연산자: &&, ||, !
		//대부분 관계 연산자와 함께 사용됩니다.
		//1) &&모든 관계 연산의 결과가 true이면 true, 아니면 false
		//2) ||    관계 연산의 결과가 true이면 true, 아니면 false
		//3) !     관계 연산의 결과를 반대로 변경
		
		int a=10;
		int b = 10;
		System.out.println(a==10 && b==10); //둘다 true->true
		System.out.println(a==10 || b==10);	//둘중 하나라도 true->true
		System.out.println(!(a==10) );	//not연산 때문에 false됨
		
		System.out.println();
		System.out.println(a == 0 && ++b >0);	//false
												//&&연산은 && 이전부분(a==0)이 false가 나오면 && 이후 연산을 그만 연산을 멈춘다.
												//어짜피 false니까 && 이후 부분을 처리를 안한다
		
		System.out.println(a);	//10, 값이 바뀐게 아니기 때문
		System.out.println(b);	//10, 
		
		System.out.println();
		System.out.println(a==10 || ++b>10);	//true
												//||연산은 ||이전부분이 true가 나오면 || 이후 연산을 그만 연산을 멈춘다.
		System.out.println(a);
		System.out.println(b);
		
	}

}
