package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Socket client = null;
		Scanner sc = null;
		BufferedOutputStream bos = null;
		
		BufferedInputStream bis = null;
		
		try{
			//서버에 접속하기
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속되었습니다.");
			
			//서버에 메세지 보내기
			sc = new Scanner(System.in);
			System.out.print("서버에  인사말을 건내보세요>>> ");
			String message = sc.nextLine();
			bos = new BufferedOutputStream(client.getOutputStream());	//bos : 클라이언트가 서버에게 보내는 출력스트림 , byte임
			bos.write(message.getBytes("UTF-8"));
			bos.flush();
			
			//서버가 보낸 답변 메시지 받기
			bis = new BufferedInputStream(client.getInputStream());
			byte[] b = new byte[1024];
			int length = bis.read(b);	//메시가 저장된 곳: b, 메시지의 글자수 저장은: length
			String message2 = new String(b, 0, length, "UTF-8");
			System.out.println(message2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {bos.close();}
				if(bis != null) {bis.close();}
				if(! client.isClosed()) {client.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
