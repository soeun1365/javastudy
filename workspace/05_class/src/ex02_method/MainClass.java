package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.set("안소은", 25, '여', true, 160, 47);	//인수가 6개
		
		p.info();
		
		double bmi = p.getBMI();
		System.out.println(bmi);
		
	}

}
