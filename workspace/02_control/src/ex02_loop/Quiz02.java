package ex02_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 영화 평점을 입력받아서 별(★)을 출력
		// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력처리

		Scanner sc = new Scanner(System.in);
		int grade = 0;
		do {
			System.out.print("영화 평점 입력(소수점 없이)>>> ");
			grade = sc.nextInt();	
		}while(grade<1 || grade>5);
		
		/*
		for(int i=0 ; i< grade ; i++) {
			System.out.print("★");
		}
		*/
		
		String stars ="";	//빈 문자열("")은 문자열 연결 연산(+)에서 초기화로 사용하는게 좋다
							//null 키워드가 아닌 문자열로 인식되서
							//일반적으로는 null로 초기화하긴 함!!!
		for(int i=0 ; i< grade ; i++) {
			stars += "★";
		}	
		System.out.println("평점: " + grade + "(" +stars + ")");	
		
	}
}
