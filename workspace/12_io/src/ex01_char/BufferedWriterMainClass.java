package ex01_char;

import java.awt.image.BufferedImageOp;
import java.io.*;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;

//	BufferedWriter 클래스(버퍼가 들어있는, 버퍼를 사용하는 writer)
// 1. 보조 스트림입니다.
// 2. FileWriter 클래스와 같은 메인 스트림과 함께 사용합니다.
// 3. 내부 버퍼를 이용해서 동작 속도를 향상시킬 수 있습니다.
//		fileWriter만쓰면 좀 느리고 BufferWiter을 같이 쓰면 좀 낫다.

public class BufferedWriterMainClass {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			//보조스트림 bw를 사용할 때는
			//bw만 닫으면 됩니다, 함께 닫힘
			try {
				if(bw != null) {bw.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}