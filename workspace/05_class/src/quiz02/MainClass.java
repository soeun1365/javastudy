package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		//Calculator calc; 	//객체는 없고, 참조변수만 있는 상태입니다.
		
		Calculator calc = new Calculator();	
		//객체가 만들어지고, 그 참조값이 calc에 전달된다
		//객체가 만들어지는 시점을 "인스턴스화" 되었다고 합니다. = 만들어졌습니다.
		
		//<<method 1번>>
		calc.addition(1, 2);
		
		//<<method 2번>>
		int a = 5;
		int b = 10;
		if(a >=  b) {
			System.out.println(a + " - " + b + " = " + calc.substraction(a, b) );//전달하는것 a,b를 "인수"라고 부름
		}else {
			System.out.println(b + " - " + a + " = " + calc.substraction(a, b) );//전달하는것 a,b를 "인수"라고 부름
		}
	}

}
