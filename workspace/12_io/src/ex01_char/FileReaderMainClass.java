package ex01_char;

import java.io.FileReader;
import java.io.IOException;

//FileWriter의 반대역할이다

/*
FileReader클래스
1. "문자기반" + "입력스트림"입니다. (writer)
2. 문자를 읽을 때 사용합니다.
	1) 통신 : 상대방이 보낸 문자를 받을 때
	2) 파일 : 텍스트파일을 읽을 때 사용
3. 입력메소드
	read()
4. 입력 단위
	char[], String, int
5. 예외처리가 필요합니다.

*/
public class FileReaderMainClass {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("text1.txt")){
		/*	//read()메소드를 이용해서 읽기
			while(true) {
				int ch = fr.read();	// ch에는 읽은 문자 또는 -1이 저장됨
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);	//읽은 문자 보여줄때는 char로 캐스팅해서 보여주기
			}
		*/	
			//주--로 이렇게 줄여서 쓰기도함
			int ch = 0;
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}