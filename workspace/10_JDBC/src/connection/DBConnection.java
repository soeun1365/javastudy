package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	//method
	//1.결과타입 : Connection
	//2.메소드명 : getConnection
	//3.매개변수 : 없음
	//4.예외처리 : ClassNotFoundException, SQLException
	
	//throws의 의미
	//getConnection() 메소드에서는 예외처리를 하지 안혹,
	//getConnection() 메소드를 호출하는 곳으로 예외를 던져서 처리하겠다.
	
	
	//public Connection getConnection() throws ClassNotFoundException, SQLException {	//Exception 들 통합해서 아래처럼 EXception이라 적어도 됨
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");	//오라킅 드라이버.class 파일을 사용하겠다
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
