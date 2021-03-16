package ex01_variable;

public class Ex01_literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 정 수표현법: 그냥 입력한다.
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(2147483647);		//int범위는 그냥 씁니다.
			System.out.println(2147483648L);	//int범위를 벗어나면 접미사 L을 붙입니다. Long 의 약자 L임 
												//Long 타입으로는 저장안되는 숫자 없다 지금은
		// 2. 실수 표현법: 문자, 입력
			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
			//1.7976931348623157E(지수E)308 : 1.7976931348623157 x 10의 308제곱
			//4.9E-324 : 4.9 x 10의 -324제곱
			
		// 3. 문자 표현법": 작은 따옴표(')로 묶는다
			System.out.println('A');
			System.out.println('한');
			
		// 4. 문자열 표현법 : 큰따옴표(")로 묶는다.
			System.out.println("안녕하세요");
				
		// 5.논리 표현법 : true
			System.out.println(true);
			System.out.println(false);
	}

}
