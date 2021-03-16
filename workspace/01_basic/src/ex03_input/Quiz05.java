package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		//성별을 의미하는 숫자 (1~4)를 입력 받아서 "남", "여" 구분 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4 사이의 숫자를 입력하시오");
		int no = sc.nextInt();
		
		if(no == 1 || no ==3) {
			System.out.println("성별: 남자");
		}else if(no == 2 || no ==4) {
			System.out.println("성별: 여자");
		}
	}
}
