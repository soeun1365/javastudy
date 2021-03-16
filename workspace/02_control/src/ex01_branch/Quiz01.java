package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		//임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수" 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("양수 1개를 입력>>> ");
		
		int no = sc.nextInt();
		
		if(no % 3 == 0) {
			System.out.println("3의배수입니다.");
		} else if(no % 2 ==1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		sc.close();
	}

}
