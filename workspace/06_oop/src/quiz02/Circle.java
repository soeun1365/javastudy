package quiz02;

public class Circle {

	//field
	private Coord center;
	private double radius;
	
	//constructor
	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	public Circle(int x, int y, double radius) {
		this.center = new Coord(x,y);	//new를 사용해서 생성
		this.radius = radius;
	}
	
	//method
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public void info() {
		System.out.print("중심좌표");
		center.info();
		System.out.print(", 반지름: " + radius);
		System.out.print(", 넓이: " + getArea());
	}
	
	
}
