package ex03_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {

		// Scanner 클래스
		// 1. 패키지: java.util
		// 2. import가 필요합니다.
		//		-import 필요 없는 패키지: java.lang (자바랭)
		// 3. 메소드
		//	  	1) nextInt() : int입력
		//	 	2) nextLong() : long입력
		//   	3) nextDouble() : double입력
		//	  	4) next() : String입력 (공백 없는 String)
		//	  	5) nextLine() : String입력 (공백 있는 String)
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용합니다.
		// 표준 입력 스트림: System.in (키보드에 연결된 입력통로)
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름 입력하기
		System.out.println("이름을 입력하세요");
		String name = sc. nextLine();	//이름에 공백이 가능합니다.
		
		// 2. 나이를 입력하기
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		// 3. 키 입력하기
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		
		// 4. 성별 입력하기
		System.out.println("성별을 입력하세요");
		char gender = sc.next().charAt(0);	//지정 index위치의 문자만 뽑음
		
		// 입력정보 확인하기
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("성별: " + gender);
		
		// 6. 스트림 닫기 
		sc.close();	//JVM에서 자동으로 닫아주기도해서 생략가능
	}

}
