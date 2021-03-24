package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import connection.DBConnection;

public class CreateTableMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
		//1. 접속
		con = DBConnection.getConnection();
		
		//2. 쿼리문 미리 준비 (PreparedStatement 클래스를 사용하므로, 얘는 쿼리문이 먼저 있을때 실행이 됨)
		//	 키워드는 대문자 테이블명, 컬럼명 등 사용자가정의한것은 소문자로 작성해보겠다
		String sql = "CREATE TABLE staff("+
					 "No NUMBER PRIMARY KEY,"+
					 "Name VARCHAR2(100)," +
					 "department VARCHAR2(100),"+
					 "hireDate DATE"+
					 ")";
		
		//3. 쿼리문 처리를 위한 PreparedStatement ps객체 생성
		ps = con.prepareStatement(sql);
		
		//4. 쿼리문 실행
		ps.executeUpdate();

		System.out.println("staff테이블이 생성되었습니다.");
		
		//5. 자원(리소스) 반납
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null)ps.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
}