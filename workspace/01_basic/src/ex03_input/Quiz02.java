package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// double 타입의 실수 2개를 입력 받아서 값을 교환하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 실수 타입 숫자를 입력하세요");
		Double no1 = sc.nextDouble();
		
		System.out.print("두번째 실수 타입 숫자를 입력하세요");
		Double no2 = sc.nextDouble();
		
		Double swap;
		swap = no1;
		no1 = no2;
		no2 = swap;
		
		System.out.println("두값을 교환하면");
		System.out.println("첫번째: " + no1);
		System.out.println("두번째: " + no2);

	}

}
