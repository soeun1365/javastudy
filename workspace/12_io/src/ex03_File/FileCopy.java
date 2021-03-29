package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		//원본 bird.mp4
		//FileInputStream을 통해서 읽습니다.
		//속도를 높이기 위해서 BufferedInputStream을 사용합니다.
		BufferedInputStream bis = null;
		
		//복사본 C:\\MyTemp\\bird.mp4
		//경로 지정을 위해서 File 클래스를 사용하고,
		//FileOutputStream을 통해서 복사본 만듭니디ㅏ.
		File copy = new File("C:\\MyTemp", "bird.mp4");
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("bird.mp4"));	//현재 디렉터리의 bird.mp4
			bos = new BufferedOutputStream(new FileOutputStream(copy));		// C:\\ MyTemp 디렉터리의 bird.mp4
			
			//복사시작시간
			long start = System.currentTimeMillis();
			byte[]b = new byte[1024];	//1024byte씩 옮기겠다
			int length = 0;
			while((length = bis.read(b)) != -1){	//length는 실제 읽어들인길이 
				bos.write(b, 0, length); 			//b배열에 0부터 length까지
			}
			//복사끝, 복사종료시간
			long end = System.currentTimeMillis();
			
			System.out.println(copy.getAbsolutePath());
			System.out.println("복사소요시간: " + ((end - start)*0.001) + "초");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {bos.close();}
				if(bis != null) {bis.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
