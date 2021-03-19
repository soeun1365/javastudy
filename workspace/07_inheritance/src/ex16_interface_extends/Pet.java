package ex16_interface_extends;

public class Pet {

	//field
	private String name;

	//constructor
		public void setName(String name) {
		this.name = name;
	}
	
	//mothod	
	public String getName() {
		return name;
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public void feed(String food) {
		System.out.println(name + " is eating " + food);
	}
}
