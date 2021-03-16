package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {

	//6. 조건 연산자 (삼항 연산자)
		//조건식? true일 때 : false일 때 ; ( if문의 연산자 버전 )

		int score = 70;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		//문제1.
		//평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격:, 아니면  "블합격"
		int kor = 80;
		int eng = 90;
		boolean isPass = ((kor + eng) /2 >=80) ||(kor>=80 && eng >=80);
		System.out.println(isPass ? "합격이야 " : "불합격이야");
		
		
		
		//문제2.
		//2자리(10~99)정수중에서 하나를 임의로 선언하고, 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		//카프리카수: 45,55,99
		int n = 45;	// 45*45 ->2025  20    25    20+25 = 45 ->자기자신
		
		int square = n * n;	// Math.pow(n,2);
		int front = square / 100;
		int end = square % 100;
		
		boolean isKaprekar = (n == front + end);
		System.out.println(isKaprekar ? "맞다" : "아니다");
		
		
	}

}
