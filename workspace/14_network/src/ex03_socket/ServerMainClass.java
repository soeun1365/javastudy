package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client = null;
		BufferedInputStream bis = null;
		
		Scanner sc = null;
		BufferedOutputStream bos = null;
		
		try {
			//서버 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));

			while(true) {
				//클라이언트 접속
				System.out.println("=======서버가 동작하고 있습니다.=======");
				client = server.accept();	//클라이언트가 올때까지 멈춰서 기다린다
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 : [" + isa.getHostName() + "]");
				
				//클라이언트가 보낸 메시지 받기
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[1024];
				int length = bis.read(b);	//메시지가 저장된 곳: b, 메시지의 글자수 저장은: length
				String message = new String(b, 0, length, "UTF-8");
				System.out.println(message);
				
				//클라이언트에게 보낸 답변 메시지 보내기
				sc = new Scanner(System.in);
				System.out.print("클라이언트에게 답변을 보내세요>>> ");
				bos = new BufferedOutputStream(client.getOutputStream());
				String message2 = sc.nextLine();
				bos.write(message2.getBytes("UTF-8"));
				bos.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {bos.close();}
				if(bis != null) {bos.close();}
				if(! server.isClosed()) {server.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
