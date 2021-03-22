package ex08_static;

public class MyMath {
	
	//private 생성자 -> MyMath내부에서만 생성할 수 있다, 외부에서 new할수없음
	private MyMath() {}
	
	//원주율 - 클래스필드
	public static final double PI = 3.141592;
	
	//절대값 - 클래스메소드
	public static double abs(double n) {	
		return(n > 0) ? n : -n;
	}
	
	//제곱 - 클래스메소드
	public static double pow(double a, int b) {	//a의 b제곱
		double result = 1;
		for(int i = 0 ; i < b ; i++) {	//b만큼 곱해주자
			result *= a;
		}return result;
	}

}
