package ex03_input;

import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		
		// int타입의 점수를 3개 입력 받아서 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어>>> ");
		double kor = sc.nextDouble();
		System.out.print("수학>>> ");
		double mat = sc.nextDouble();
		System.out.print("영어>>> ");
		double eng = sc.nextDouble();
		
		double ave = (kor + mat + eng)/3.0;	//3으로 하면 소수점이 잘려나감
											//3.0으로 해야 정수/실수로 해야 -> 실수형 나옴
		System.out.println("평균은: " + ave);
		
		sc.close();
	}

}
