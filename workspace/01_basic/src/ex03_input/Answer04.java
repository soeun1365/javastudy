package ex03_input;

import java.util.Scanner;

public class Answer04 {

	public static void main(String[] args) {
		
		//int타입의 매출액 + 등급("vip", "일반") 입력 받아서 실매출액 출력하기
		//vip : 20% 할인
		//일반 : 5%할인
		
		//String 은 값이 아니라 참조타입이므로 ==을 쓸수 없음 equls()사용
		
		//이름을 만드는법 name convension
		//종류에
		//snake case: 밑줄을 사용		    					ex) score_eng	
		//lower camel case	소문자로시작해서 대문자로 단어구분		ex) salesMoney	주로 변수,메소드 네이밍
		//upper camel case	대문자로시작해서 대문자로 단어구분		ex) QuizAnswer  주로 클래스 네이밍
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액을 입력하세요 (단위 원)>>> ");
		int salesmoney = sc.nextInt();
		
		System.out.print("등급을 입력하세요 (vip or 일반)>>> ");
		String grade = sc.next();

		// double disCountRate = grade.equals("VIP")? 0.2 : 0.05; 대문자 소문자 vip 모두 가능하게 아래에 수정코드
		double disCountRate = grade.equalsIgnoreCase("Vip") ? 0.2 : 0.05;	//대소문자 무시
		
		salesmoney -= (salesmoney * disCountRate);	//int * double 내부적으로 -=에서 프로모션(자동형변환 일어남)
		
		System.out.println(salesmoney);
		
		sc.close();
	}

}
