package ex01_char;
//	PrintWriter 클래스
// 1. 기본적으로 FileWriter 클래스와 같은 목적으로 사용합니다.
// 2. 지원되는 출력메소드가 다양함
//		writer(), print(), println()
// 3. println()메소드를 사용하면 자동으로 줄 바꿈이 처리됩니다.

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMainClass {

	public static void main(String[] args) {
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter("index.html");
			out.println("<script>");
			out.println("alert('HELLO Java!')");
			out.println("</script>");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {out.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}