package connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		
		//DBConnection 클래스의 getConnection()메소드를 호출
		//getConnection() throws Exception 이므로 여기서 try-catch처리해서 받아야한다.
		
		try {
			/* ====================인스턴스 메소드 getConnection()====================
				DBConnection connection = new DBConnection();	new는 좋은방법이 아님
			 	Connection con =connection.getConnection();
			==========================================================================
			*/
			
			// ====================클래스 메소드 getConnection()====================
			Connection con = DBConnection.getConnection();
			//DBConnection public뒤에 static을 붙여서 클래스이름으로 호출한다.	//같은 패키지의 DBConnection클래스에 getConnection메소드를 호출
			//new할 필요가 없음
			//접속할때 필요한 정보들은 new로 새롭게 만들 필요가 없기 때문 다 같으니까
			
			System.out.println("DB에 접속되었습니다.");
			con.close();
			System.out.println("DB접속이 해제되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
