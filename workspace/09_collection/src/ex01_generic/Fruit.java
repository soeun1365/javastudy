package ex01_generic;

public class Fruit {

	//field
	private String name;
	private int price;
	
	//constructor
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//method
	@Override		//메뉴로 작성가능
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
}
