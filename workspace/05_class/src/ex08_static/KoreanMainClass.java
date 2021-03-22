package ex08_static;

public class KoreanMainClass {

	public static void main(String[] args) {
		
		//인스턴스 korean1
		Korean korean1 = new Korean();
		
		//인스턴스 필드에 접근
		korean1.name = "홍길동";

		//클래스 필드에 접근
		System.out.println(korean1.COUNTRY);	//추천하지 않음
		System.out.println(Korean.COUNTRY);		//클래스이름으로 접근
	}

}
