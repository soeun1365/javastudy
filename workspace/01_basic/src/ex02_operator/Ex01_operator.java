package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
	//1. 산술연산자 : =,  -,  *,  /,  %
		System.out.println(7+2);	
		System.out.println(7-2);	
		System.out.println(7*2);	
		System.out.println(7/2);	//몫, 						정수끼리 연산은 답도 정수
		System.out.println(7%2);	//나머지
		
		System.out.println(7.0/2.0);	//실제로 나누기 연산			실수끼리 연산은 답도 실수

	//2. 증감연산자: ==, --
		int a = 10;
		System.out.println(++a);	//11, a를 먼저 증가시키고 출력
		System.out.println(a++);	//11, a를 먼저 출력시키고 증가
		System.out.println(a);		//12, 증가된 값 출력됨
		
		int b = 10;
		System.out.println(--b); 	//9, b를 먼저 감소시키고 출력
		System.out.println(b--);	//9, b를 먼저 출력시키고 감소
		System.out.println(b);		//8, 감소된 값 출력됨
		
		System.out.println(a+b); 	//20
		
	//3. 대입연산자: =, +=, -=, *=, /=, %=
		//문제)x와 y값을 교환해 봅니다.
		
		int x = 1;	
		int y =2;
		int temp=0;
		
		temp=x;		//x를 temp에 백업
		x=y;		//x는 y가 됨
		y=temp;		//y는 백업해 둔 x가 됨
		
		System.out.println("x: " + x + " y: " + y);
		
		//a += 1 : a = a+1
		//a -= 1 : a = a-1
		//a *= 1 : a = a*1
		//a /= 1 : a = a/1
		//a %= 1 : a = a%1
		
		//문제) money를 5% 증가시켜보세요.
		
		int money = 100;
		System.out.println(money);
		
		//답
		//money = money + money*0.05;
		               //------------>실수부 라서 int money에 들어갈 수 없음 casting하기
		//money = money + (int)(money * 0.05);
		
		money += (int)(money * 0.05);
		//money *= 1.05; 이것도 가능
		
		System.out.println(money);
		
	}
}
