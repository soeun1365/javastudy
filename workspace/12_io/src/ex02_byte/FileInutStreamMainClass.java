package ex02_byte;

import java.io.FileInputStream;

public class FileInutStreamMainClass {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byte1.txt");
			while(true) {
				int b = fis.read();
				if(b == -1) {
					break;
				}
				System.out.print((char)b);
				//바이트 기반이기때문에 깨짐, 영어는 하나당 1바이트라 괜찮지만..
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {fis.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
