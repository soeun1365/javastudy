package ex03_input;

import java.util.Scanner;

public class Quiz07 {

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
		
		if(fat >=25)
			state = "과체중입니다.";
		else if(fat >=20 && fat <=24)
			state = "정상입니다.";
		else if(fat <=19)
			state = "저체중입니다.";
		System.out.println("체질량 지수: " + fat + "이며 " + state);

	}

}
