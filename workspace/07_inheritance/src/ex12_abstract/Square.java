package ex12_abstract;

public class Square extends Rectangle {

	//Rectangle이 width, height를 가지고있기 때문에 field쓰지않음
	
	//constructor		source메뉴에서 슈퍼클래스의 필드만을 사용해서 constructor생성 후
	//					height자리에 width만 써줌
	public Square(int width) {
		super(width, width);
	}
	
	//method
	//Rectangle의 메소드는 이미 사용할 수 있습니다.
	//getter, setter, getArea()는 이미 사용할 수 있습니다.
	
}
