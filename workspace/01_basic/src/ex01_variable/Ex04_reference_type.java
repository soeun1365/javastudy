package ex01_variable;

public class Ex04_reference_type {

	public static void main(String[] args) {
		
		//reference type
		//primitive type을 제외한 모든 type(자료형)
		
		String s1 = "apple";
		String s2 = new String("apple");
		
		//s1에 저장된 데이터는?
		//"apple"이 저장되어 있는 메모리 주소(참조)값이 저장되어 있다.
		
		System.out.println(s1 ==s2); //주소값을 갖고있기때문에 두 주소값이 다르다고 나옴 false
	}
}
