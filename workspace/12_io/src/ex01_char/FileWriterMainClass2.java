package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 	try-catch-resources문
 	1. close()메소드를 자동으로 호출하는 try문 -> 얘를 쓰면 finally안써도 되서 코드 줄어들어서 좋음
 	2. 형식
 		try(스트림 생성){
 			...
 		}catch( ... ){
 			...
 		}
 */

public class FileWriterMainClass2 {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("text2.txt")){
			char[] cbuf = {'H', 'E', 'L', 'L', 'O'};
			
			//(출력하고자하는것, offset(startIndex), length)
			fw.write(cbuf, 0, 1);
			
			//전체출력
			//fw.write(cbuf, 0, cbuf.length);
			//fw.write(cbuf); 이렇게 해도 값은 같지만
			//데이터가 큰 경우 버퍼로 나눠서 전달받아오는데 실데이터보다 더 큰값이 저장될 수 있다
			//lnegth를 쓰면 그럴일이 없음
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
