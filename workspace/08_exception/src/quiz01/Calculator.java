package quiz01;

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
	
	public void division(int a) {
		result /= a;
		System.out.println("현재 저장된 값: " + result);
	}
}
