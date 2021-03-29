package ex03_File;
/*
  	File 클래스
  	1. 파일을 조작하는 클래스, 주로 혼자 쓰이는게 아니라 스트림과 같이 쓰임
  	2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
 */

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class FileOverviewMainClass {

	public static void main(String[] args) {
		
		//디렉터리 조작
		File dir = new File("C:\\MyTemp");	//경로구분(\\, File.separator) 				윈도우에서 \\
		//File dir = new File("C" + File.pathSeparator + "MyTemp");	//위와 같음			Linux와 Windows에서 모두 호환가능한 Firl.separator
		
		System.out.println(dir.exists()); 	//존재하는 경로-> true, 존재하지 않는 경로-> false
		
		if(dir.exists() == false) {	//if(!dir.exists()) 같은역할 (회사에서 !를 최대한 쓰지 마세요 하면 왼쪽꺼 쓰기)->!가 잘 안보이고 헷갈리기 때문
			dir.mkdirs();	//dir 디렉터리를 생성합니다.
			System.out.println("My Temp 디렉터리가 생성되었습니다.");
		}
		/*
		if(dir.exists()) {	//if(dir.exists == true)
			dir.delete();	//dir 디렌터리를 삭제합니다.
			System.out.println("My Temp 디렉터리가 삭제되었습니다.");	//휴지통에도 안들어감
		}
		*/
		//파일조작
		File file = new File("C:\\MyTemp\\MyFile.txt");
		//File file = new File("C:\\MyTemp", "MyFile.txt");
		//File file = new File(dir, "MyFile.txt");	//★주로		//셋다 똑같음
		
		System.out.println(file.exists());
			try {
				if(file.exists() == false) {	// if(file.exists() == false
					file.createNewFile();
				}
			}
		catch(IOException e) {
			e.printStackTrace();
		}
			
		System.out.println(file.getAbsolutePath());			//C:\MyTemp\MyFile.txt
		System.out.println(file.getPath());					//C:\MyTemp\MyFile.txt
		System.out.println(file.getParent());				//C:\MyTemp
		System.out.println(file.getName());					//MyFile.txt
		
		System.out.println(file.lastModified());			//1616978503386, 최종수정일, 밀리시간으로 숫자로 표현한것
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		System.out.println(sdf.format(new Date(file.lastModified())) );	//1616978503386 -> 2021-03-29 ->2021-03-29 오전 9:40
																	
		System.out.println(file.length());		 			//0
		
		
		//디렉터리 내의 모든 디렉터리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");	// 여기에 들어있는게 여러개니까 배열사용
		File[] files = javaDir.listFiles();									//javaDir을 서버저장소라고 생각하자
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(File f : files) {
			System.out.print(sdf2.format(new Date(f.lastModified()))+ " ");
			if(f.isDirectory()) {
				System.out.print("<dir> " + "       ");
			}else {
				System.out.print("            " + new DecimalFormat("#,##0").format(f.length()));
			}
			System.out.println("        "+f.getName());
		}
	}		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

}
