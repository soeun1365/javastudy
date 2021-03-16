package ex07_recursive;

public class Calculator {

	// 역할: n!값을 반환합니다.
	// 3!(3팩토리얼) 은 1*2*3* 의미
	public int getFactorial(int n) {
		
		//return 3 * 2 * 1 로 반환해야함
		if(n == 1) {
			return 1;
		}else {
			return n * getFactorial(n-1);
		}
		
	}
}
