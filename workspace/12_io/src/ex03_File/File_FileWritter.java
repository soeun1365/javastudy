package ex03_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_FileWritter {
//파일과 스트림을 같이 사용하자 이렇게 자주 사용됨
	public static void main(String[] args) {
		
		//text.txt 파일 조작 객체 file 생성
		File dir = new File("C:\\MyTemp");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "text.txt");

		//text.txt 파일에 데이터 보내기
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("안녕하세요.");
			fw.write('\n');
			fw.write("반갑습니다.");
			System.out.println(file.getAbsolutePath() + " 파일이 생성되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {fw.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
