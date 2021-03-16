package ex07_recursive;

public class MainClass {

	public static void main(String[] args) {
		
		SayHello sh = new SayHello();
		
		sh.say(5);	//인수 전달 안하면 재귀호출은 끝나지않음, 뻑나지 않게 하는게 중요

		Adder adder = new Adder();
		adder.calculate(10);	//1부터 10까지 합계를 구해서 보여줍니다.
		System.out.println(adder.getTotal());
		
		Calculator calc = new Calculator();
		int n = 3;
		System.out.println(n + "! = "+ calc.getFactorial(n));
	}

}
