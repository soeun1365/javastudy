package quiz01;

public class MainClass {

	public static void main(String[] args) {

		//계산기를 만들고,
		//4가지 연산을 모두 수행하고,
		//발생할 수 있는 예외를 예상해서 처리해 봅시다
		
		Calculator cal = new Calculator();
		try {
			cal.addition(10);
			cal.substraction(5);
			cal.multiplication(2);
			cal.division(0);
		}catch(ArithmeticException e) {							//10/0 = Exception발생		//10.0/ 0.0 = Infinity
			System.out.println("예외가 발생하였습니다.");		//Calculator의 result가 현재 int이기때문에 Exception발생, double일 경우엔 result Infinity로 나옴
		}
	}
}
