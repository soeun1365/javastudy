package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//DataOutPutStream 클래스
// 1. 자바의 데이터 타입 그대로 출력하는 클래스입니다.
// 2. 출력 메소드
//    writeByte(), writeInt(), writeLong(), writeDouble()등 타입별로처리


public class DataOutPutStream {

	public static void main(String[] args) {
		DataOutputStream dos = null;
		
		try {
			dos= new DataOutputStream(new FileOutputStream("byte3.dat"));	//dat파일 열어볼수있는건 아님
			int age = 44;
			double weigth = 60.0;
			String name = "김민지";
			
			dos.write(age);
			dos.writeDouble(weigth);
			dos.writeUTF(name);
			
			//name은 이렇게들도 가능
			//dos.writeBytes(name);
			//dos.writeChars(name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos != null) {dos.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}