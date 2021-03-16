package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Coord center = new Coord(0,0);
		Circle won = new Circle(center, 1.5);
		Circle won2 = new Circle(1,1,1.5);
		
		center.info();	//센터의 정보를 출력
						//[0, 0]
		System.out.println();	//강제 줄바꿈
		won.info();	//중심좌표[0, 0], 반지름: 1.5, 넓이: x.xx
		
		System.out.println();	//강제 줄바꿈
		won2.info();
		

	}

}
