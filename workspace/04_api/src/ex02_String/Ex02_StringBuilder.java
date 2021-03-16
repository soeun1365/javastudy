package ex02_String;

//String 의 (+)연결연산자 많이 사용하면 성능이 떨어집니다. -->메모리 많이씀
public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder		//import가 필요없음
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("hello");
		
		// 문자열 추가 (핵심 메소드)
		sb.append(" ").append("java");

		System.out.println(sb);
		
		//문자열 비교
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(sb1.equals(sb2));	//StringBuilder라서 안됨(String이 아님)
		
		// 문자열로 변환해 봅시다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));	//이제 비교가 됨
	}

}
