package ex09_upcasting;

public class Latte extends Espresso{

	//field
	private int milk;

	//constructor
	public Latte(String bean, int water, int milk) {
		super(bean, water);
		this.milk = milk;
	}
	
	//method
	@Override
	public void info() {
		super.info();	//Espresso 의 info()
		System.out.println("우유: " + milk + "ml");
	}
	
	public void taste() {
		System.out.println("라떼는 부드럽습니다.");
	}
}
