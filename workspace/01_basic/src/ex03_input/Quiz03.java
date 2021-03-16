package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//나이를 입력 받아서  "성인", "미성년자" 구분 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이를 입력하시오: ");
		
		int age = sc.nextInt();
		
		if (age<20) {
			System.out.println("당신은 미성년자입니다.");
		}
		else
			System.out.println("당신은 성인입니다.");
	}

}
