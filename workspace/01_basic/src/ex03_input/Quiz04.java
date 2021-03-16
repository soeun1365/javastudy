package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		//int타입의 매출액 + 등급("vip", "일반") 입력 받아서 실매출액 출력하기
		//vip : 20% 할인
		//일반 : 5%할인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액을 입력하세요 (단위 원)");
		Double money = sc.nextDouble();
		
		System.out.print("등급을 입력하세요 (vip or 일반)");
		String grade = sc.next();
		
		Double realmoney =0.0;
		
		if(grade == "vip") {
			realmoney = money * 0.8;
		}
		else if(grade == "일반") {
			realmoney = money * 0.95;
		}
			System.out.println("실매출액: " +realmoney);
	}

}
