package ex05_throw;

public class Calculator {
	//field
	private int result;
	
	//method
	public void addition(int a) {
		result += a;
		System.out.println("현재 저장된 값: " + result);
	}
	
	public void substraction(int a) {
		result -= a;
		System.out.println("현재 저장된 값: " + result);
	}
	
	public void multiplication(int a) {
		result *= a;
		System.out.println("현재 저장된 값: " + result);
	}
	
	public void division(int a) throws ArithmeticException {	//2. division()메소드가 어떤 예외를 던지는지 명시합니다.
																//던지는게 여러개 일수도 있으니 throws 처럼 뒤에 s 꼭 붙여야함
		if(a == 0) {
			throw new ArithmeticException();		//1.예외를 직접 던집니다.
		}
		result /= a;
		System.out.println("현재 저장된 값: " + result);
		
	}
}
