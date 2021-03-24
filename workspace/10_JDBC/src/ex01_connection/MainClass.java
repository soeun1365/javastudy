package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {

		//1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 로드합니다. 올립니다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		//예외처리를 해야 빨간줄 안뜸, ClassNotFoundException 발생 가능이 있기 때문
																	//오타가났거나, 빌드패스 연결이 안되어있을경우
		
			//2. 접속정보 준비(주소, 유저, 패스워드)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	//Oracle 11g Express Edition용이다.  (Express Edition은 thin driver이라고도 함 - 가벼운 데이터베이스)
																//DB서버주소 127.0.0.1 (==localhost)
			String user = "spring";								//대소문자 구분 없음
			String password = "1111";
		
			//3. 접속
			//DriverManager 클래스가 접속을 담당하고,
			//접속 결과는 Connection 인터페이스에 저장합니다.
			Connection con = DriverManager.getConnection(url, user, password);	//SQLException 발생가능 	//자동완성하기
			
			//4. 접속이 성공하면 여기로 도착
			System.out.println("DB에 접속되었습니다.");
			
			//5. 접속 종료
			con.close();
			
		}catch(Exception e) {										
			e.printStackTrace();
		}
	}

}
