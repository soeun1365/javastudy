package ex03_input;

import java.util.Scanner;

public class Answer07 {

	public static void main(String[] args) {
		//체질량지수 구해서 건강상태 출력하기
		//double 타입의 몸무게와 키를 입력하고,
		//체질량지수 = 몸무게 / 키(단위:m)의 제곱
		
		//건강상태
		//25이상 "과체중"
		//24~20 = "정상"
		//19이하="저체중"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
		
		double fat = weight / Math.pow((height/100), 2);
		String state = null;
		
		height /=100;	//185.5cm --> 1.855m
		
		double bmi = weight / Math.pow(height, 2);
		
		String healthCondition = (bmi >=25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		
		System.out.println("체질량 지수: " + bmi + "(" + healthCondition + ")");

	}

}
