package ex13_interface;

public class Circle implements Shape {
	
	//field
	private int radius;

	//constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	//method
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
