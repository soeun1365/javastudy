package ex01_char;
/*
	FileWriter클래스
	1. "문자기반" + "출력스트림"입니다. (writer)
	2. 문자를 보낼때 사용합니다.
		1) 통신 : 상대방에게 문자를 보낼 때
		2) 파일 : 텍스트파일을 만들 때 사용
	3. 출력메소드
		write()
	4. 출력 단위
		char[], String, int
	5. 예외처리가 필요합니다.
	
*/

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMainClass {

		public static void main(String[] args) {
			
		FileWriter fw = null;	//IO패키지 FileWriter import하기 
		try {
			fw = new FileWriter("text1.txt");	//text1.txt가 생성됩니다.	//String 타입 가져오기
			
			//text1.txt로 전송할 데이터
			char[] cbuf = {'H', 'E', 'L', 'L', 'O'};
			String str = " java";
			int ch = '!';	//스트림의 기본단위 int 
			String str2 = "Nice to meet you!";
			
			//text1.txt파일로 데이터 전송하기
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			fw.write('\n');	//줄바꿈 직접넣어주기
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
			
		}catch(IOException e) {		//자동완성으로 IOException나옴, 그냥 Exception해도되고
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {fw.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
