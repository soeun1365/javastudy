package ex13_interface;

//인터페이스는 본문이 없는 추상메소드를 가지고 있으므로,
//해당 추상메소드를 오버라이드를 해주어야한다

//클래스를 상속 받을 때는 extends를 사용하고,
//인터페이스를 구현 할 때는 implements(구현)를 사용합니다.

//클래스를 상속받는다. === 인터페이스를 구현한다  (거의 같은 말이라고 봐도 됨) 

public class Rectangle implements Shape {	//extends를 implements로 바꿈 Shape은 인터페이스 이므로,, 상속받지않고 구현한다

	//field
	private int width;	//가로
	private int height;	//세로
	
	//constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	//method
	@Override
	public double getArea() {
		return width * height;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
