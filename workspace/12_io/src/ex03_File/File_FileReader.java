package ex03_File;

import java.io.File;
import java.io.FileReader;

public class File_FileReader {

	public static void main(String[] args) {
		
		File file = new File("C:\\MyTemp\\text.txt");
		try(FileReader fr = new FileReader(file)) {		//finally안해도됨
			int ch = 0;
			while((ch = fr.read())!= -1) {	//파일 내용이 끝나지않을때까지, ch에 한글자씩 읽어들인다.
				System.out.print((char)ch);	//코드값을 char로 캐스팅
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
