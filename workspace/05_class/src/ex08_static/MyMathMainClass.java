package ex08_static;

public class MyMathMainClass {

	public static void main(String[] args) {
		
		//MayMath의 필드, 클래스들이 static이고
		//private한 constructor을 가졌으므로
		//new MyMath로 객체생성 없이 가져올수있음
		//정적이니까
		
		System.out.println(MyMath.PI);
		System.out.println(MyMath.abs(-5));
		System.out.println(MyMath.pow(2, 3));

	}
}
