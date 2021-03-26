package ex02_byte;

import java.io.Serializable;

//ObjectOutputStream에 의해서 writeObjec() 메소드로 호출되는 클래스
//반드시 직렬화 해야한다.
// "직렬화" 방법 : Serializable 인터페이스를 구현한다.
//serial VersionID 를 생성합니다.

public class Board implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1290890010731263808L;
	//field
	private String title;
	private String content;
	private String writter;
	
	//constructor
	public Board(String title, String content, String writter) {
		super();
		this.title = title;
		this.content = content;
		this.writter = writter;
	}

	//method
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writter=" + writter + "]";
	}
}