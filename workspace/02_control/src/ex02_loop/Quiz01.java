package ex02_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		//1. 퀴즈 맞히기
		//맞힐때 까지 계속 물어보는 퀴즈입니다.
		//대한민국의 수도는?>>> 서울 또는 seoul
		//정답입니다.
		//대한민국의 수도는?>>> 인천
		//오답입니다.
		
		Scanner sc = new Scanner(System.in);
		
		//String city = "";	//String 선언 초기 할때 "" 또는 null을 입력한다.
		String city =null;	//do while모두에서 쓸수있도록 밖에 꺼내서 선언하기
		do {
			if(city !=null) {
				System.out.println("오답입니다.");
			}
			System.out.println("대한민국의 수도는?>>>");
			city = sc.next();
	
		}while(!city.equals("서울")&& !city.equalsIgnoreCase("seoul"));	//틀리면 계속 물어봅니다.		not 연산자 !사용
		
		System.out.println("정답입니다.");
	}
}
