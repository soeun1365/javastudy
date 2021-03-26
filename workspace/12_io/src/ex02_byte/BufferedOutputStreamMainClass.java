package ex02_byte;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 이 버퍼도 빠른속도 제공
public class BufferedOutputStreamMainClass {

	public static void main(String[] args) {
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.txt"))) {
			String str = "안녕하세요. 반갑습니다.";
			byte[] bytes = str.getBytes();
			bos.write(bytes);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}