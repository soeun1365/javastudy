package ex03_input;

import java.util.Scanner;

public class Answer03 {

	public static void main(String[] args) {
		
		//나이를 입력 받아서  "성인", "미성년자" 구분 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이를 입력하시오>>> ");
		int age = sc.nextInt();
		
		System.out.println(age>=20 ? "성인" : "미성년자");
		
		sc.close();
	}

}
