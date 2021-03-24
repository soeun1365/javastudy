package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {
		//try블록과 finally{}블록에서 모두 사용하기 위해 main()에서 선언해주기
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();		//만약여기서 에러 발생했다면 뒤에 실행 안되니까 finally에서 그냥close를 해주면 안됨
													//null값인데 close하면 에러발생, 그래서 finally에도 try-catch또 필요
			String sql = "DROP TABLE staff";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) {ps.close();}	//NullPointerException이 발생하지않으면		// 이때 if문의 실행코드 하나라서 중괄호{} 생략가능
				if(con != null) {con.close();}	//NullPointerException이 발생하지않으면		// 이때 if문의 실행코드 하나라서 중괄호{} 생략가능
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
}