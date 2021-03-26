package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("text3.txt"))){	//성능향상을 위해 버퍼를쓰자
			/*
			StringBuilder sb = new StringBuilder();	//스트링에 + 연결 대신 내부 버퍼를 사용
			while(true) {
				char[] cbuf = new char[5];	//얘가 while문 위로 나가도 괜찮음. 글자의 끝까지만 읽기때문
				int readCharCount = br.read(cbuf);
				if(readCharCount == -1) {
					break;
				}
				sb.append(cbuf, 0, readCharCount);	//읽은 글자만큼만 sb에보내겠다
			}
			System.out.println(sb.toString()); 	//일반 객체이기 때문에 string으로 바꿔서
			*/
			
			//위에랑 결과 같음
			StringBuilder sb = new StringBuilder();
			char cbuf[] = new char[5];
			int readcharCount = 0;
			while(readcharCount != -1) {
				sb.append(cbuf, 0, readcharCount);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}