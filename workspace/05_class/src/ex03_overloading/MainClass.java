package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		//직사각형
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3,4);		//가로3, 세로4
		System.out.println("넓이: " + nemo1.getArea());
		
		//정사각형
		Rectangle nemo2 = new Rectangle();
		nemo2.set(3);		//한변의길이3
		System.out.println("넓이: " + nemo2.getArea());
	}

}
