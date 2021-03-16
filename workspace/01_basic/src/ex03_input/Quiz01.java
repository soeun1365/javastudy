package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// int타입의 점수를 3개 입력 받아서 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 점수를 입력하세요.");
		int score1 = sc.nextInt();
		
		System.out.println("두번째 점수를 입력하세요.");
		int score2 = sc.nextInt();
		
		System.out.println("세번째 점수를 입력하세요.");
		int score3 = sc.nextInt();
		
		int avergae = (score1 +score2 + score3)/3;
		System.out.println("점수의 평균: "+ avergae);
		

	}

}
