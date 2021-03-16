package ex01_variable;

public class Ex03_primitive_type {

	public static void main(String[] args) {
		
		// 정수타입
		// 1. byte
		// 크기 1바이트, 단독 사용은 아니고 배열로 사용
		System.out.println(Byte.MAX_VALUE);		//-128
		System.out.println(Byte.MIN_VALUE);	//-128
		System.out.println(Byte.SIZE);	

		//비트에 의한 값의 범위
		// 8비트: -2dml 7wprhq ~ 2의 7제곱 -1
		// n비트 : -2의 (n-1) 제곱 ~ 2의 (n-1)제


		
	//3.int 타입
	//크기 4바이트, 일반적인 기본 정수 자료셩;
	System.out.println(Integer.MAX_VALUE);	//-128
	System.out.println(Integer.MIN_VALUE);	//-128
	System.out.println(Integer.SIZE);	

	//5. long타입 8바이트, int보);

	//실수타입
	//1. float 타입
	//크기 ㅣ 8바이트, 과거 호환용
	
	//double 타입
	//크기: 8바이트, 일반적인 실수자료형
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	//System.out.println(Double.MAX.EXPONENT);
	//System.out.println(Double.MIN.EXPONENT);
	System.out.println(Double.SIZE);
	
	//부호, 소수부, 지수부
	//항상 소수 자리수는 부정확할 수 있다.
	// (BigDecimal 클래스를 이용해서 정확히 표현할 수 있다.)
	
	//문자타입
	//1.char
	//크기: 2바이트 = 16비트 2의 16승 (한글, 특수문자 가능), 유니코드 기반(국제 표준 코드)->미국 아스키코드값
	System.out.println(Character.SIZE);
	
	//논리타입
	//1. boolean타입
	//크기: 이론상으로는 1비트(참, 거짓만 표현하면 되므로)
	// true, false
	
	
	//변수선언
	int a = 10;
	long b = 12345678900L;
	char c = 'a';
	float f = 1.5F;	//F 안쓰면 double에 JVM이 저장되기 때문에 float에 저장하고싶으면 F를 붙인다
	double d = 1.5;
	boolean e = true;
	
	//primitive type은 변수에 데이터가 그대로 저장됩니다.
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);	
	}

}