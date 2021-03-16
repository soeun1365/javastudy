package ex01_branch;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		// 점수를 입력 받아서 해당되는 학점을 출력하시오, 
		// char grade : 'S', 'A', 'B', 'C', 'F'
		// char point : '+', '0', '-'
		
		// 100: S
		// 99-97 : A+
		// 96-94 : A0
		// 93-90 : A-
		// 89-87 : B+
		// 86-84 : B0
		// 83-80 : B-
		// 79-77 : C+
		// 76-74 : C0
		// 74-70 : C-
		// 69-0: F

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력>>> ");
		int score = sc.nextInt();
		
		char point = '-';
		
			switch(score % 10) {
			case 9: case 8: case 7:
				point ='+';
				break;
			case 6: case 5: case 4:
				point ='0';
				break;
			}
			
		char grade = 'F';
			switch(score / 10) {
			case 10:
				grade = 'S';
				point = ' ';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				point = ' ';
			}
		
			System.out.println(""+grade + point);	//빈문자열을 더해줘야한다 -->grade를 문자열(String)로 바꿔준다
			
		sc.close();
	}
}
