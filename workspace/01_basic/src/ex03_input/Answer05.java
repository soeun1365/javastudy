package ex03_input;

import java.util.Scanner;

public class Answer05 {

	public static void main(String[] args) {
		
		//성별을 의미하는 숫자 (1~4)를 입력 받아서 "남", "여" 구분 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4 사이의 숫자를 입력>>> ");
		int iGender = sc.nextInt();
		
		//방법1
		// String gender = (iGender ==1 || iGender ==3) ? "남자" : "여자";		
		
		//방법2
		String gender = (iGender % 2==1) ? "남자" : "여자";
		System.out.println("성별은 " + gender + "입니다.");
		
		sc.close();
	}
}
