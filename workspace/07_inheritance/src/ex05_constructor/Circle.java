package ex05_constructor;

public class Circle extends Coord{
	//field
	private double radius;
	
	//constructor
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//method
	public void info() {
		System.out.println("중심좌표: [" + getX() + "," + getY() +"]");
		System.out.println("반지름: " +  radius);
	}
}
