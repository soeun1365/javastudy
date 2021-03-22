package ex08_static;

//인스턴스 : 객체 라고 생각하기
public class Korean {

	//field
	String name;	//인스턴스필드라고 함(인스턴스마다 다르다)
	static final String COUNTRY ="한국";	//클래스 필드라고 함(모든 인스턴스가 동일하다)
	//final붙일땐 변수명 대문자로 해주기
	
	//인스턴스가 10개 있다고 가정하면,
	//메모리에
	//name은 10개가 있고, country는 1개가 있습니다.
	//static=>공용변수
	//글자가 뉘어있음
}
