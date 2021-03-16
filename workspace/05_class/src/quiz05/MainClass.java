package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		Circle won = new Circle();
		
		won.setRadius(1.5);
		System.out.println("원 둘레: " + won.getCircum());
		System.out.println("원 넓이: " + won.getArea());

	}

}
