package ex03_File;

import java.io.File;

public class FileDeleteMainClass {

	public static void main(String[] args) {
		
		//c:\\MyTemp 디렉터리를 삭제합니다.
		File myTemp = new File("C:\\MyTemp");
		
		if(myTemp.exists()) {
			File[] files = myTemp.listFiles();	//데렉터리 안의 파일 다 삭제후 
			for(File file : files) {
				if(file.isFile()) {
					System.out.println(file.getName() + "파일을 삭제합니다.");
				}else {
					System.out.println(file.getName() + "디렉터리를 삭제합니다.");
				}
				file.delete();			
			}
			System.out.println(myTemp.getName() + "디렉터리를 삭제합니다.");	//디렉터리 삭제
			myTemp.delete();
		}

	}

}
