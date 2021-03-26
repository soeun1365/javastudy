package ex02_byte;

import java.io.FileOutputStream;

/*
FileOutPutStream클래스
1. "바이트기반" + "입력스트림"입니다. (Stream)
2. 모든 것을 읽을 때 사용합니다.
	1) 통신 : 상대방에게 데이터를 보낼 때
	2) 파일 : 모든 파일을 만들 때
3. 출력메소드
	write()
4. 출력 단위
	byte[] - 여러개보낼때, int - 하나 보낼때
5. 예외처리가 필요합니다.

*/
public class FileOutputStreamMainClass {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("byte1.txt");
			String str1 = "Hello java";
			String str2 = "안녕하세요. 반갑습니다.";
			int ch = '!';
			
			//String -> byte
			//getbytes() : 스트링을 바이트배열로 바꿈
			fos.write(str1.getBytes());
			fos.write(ch);
			fos.write('\n');
			fos.write(str2.getBytes());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {fos.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}