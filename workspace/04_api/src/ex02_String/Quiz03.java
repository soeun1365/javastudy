package ex02_String;

import java.lang.Character.Subset;

//파일명과 확장자명을 분리하기

public class Quiz03 {

	public static void main(String[] args) {
		
		String fullname ="2021-03-10.jpg";
		
		int idx = fullname.lastIndexOf(".");	//.(점)중에 가장 뒤쪽에 있는 .(점)
		String filename =fullname.substring(0,idx);	//2021-13-10
		String extnaem = fullname.substring(idx + 1);	//jpg
		
		
		

		System.out.println("파일명: " + filename);
		System.out.println("확장자명: " + extnaem);
	}

}
