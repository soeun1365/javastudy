package ex01_branch;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		// switch사용
		// 단계를 숫자로 입력받아 구분 출력
		// 1 입력: 기승전결
		// 2입력: 승전결
		// 3입력: 전결
		// 4입력: 결
		// 나머지 입력: 알 수 없음

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단계입력>>> ");
		int step = sc.nextInt();
		
		switch(step) {
		case 1: System.out.print("기");
		case 2: System.out.print("승");
		case 3: System.out.print("전");
		case 4: System.out.print("결");
			break;
		default: System.out.println("알수없음");
		}
		
		sc.close();
	}
}
