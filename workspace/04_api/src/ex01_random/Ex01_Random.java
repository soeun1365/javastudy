package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		// java.util.Random 랜덤생성해주는 클래스
		
		Random random = new Random();
		
		// 1. int 난수
		int rand1 = random.nextInt();		//int 번위 중에 하나
		int rand2 = random.nextInt(10);		//bound값 10 개 중 하나 (0~9)
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		//2. double 난수
		double rand3 = random.nextDouble();
		
		System.out.println(rand3); 			//0  <=  난수  <  1 (0은 나와도 1은 안나옴)
											//0% <=  난수  <  100%  (백분율 환산 -->확률처리 용으로 사용)

	}

}
