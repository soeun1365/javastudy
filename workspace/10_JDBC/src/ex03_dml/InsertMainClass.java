package ex03_dml;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//자꾸 import가 많아져서 보기 힘들면 두줄을 합치기 가능
import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (1, 'alice', '총무', '21/03/24')";	//날자는 하이푼, 슬래시만 사용하자
			ps=con.prepareStatement(sql);
			int result = ps.executeUpdate();
			// executeUpdate() 메소드 반화값은
			// 변화가 생긴 행(row)의 개수가 반환됩니다
			// insert실패하면 result에 0, 성공하면 insert 성공한 행(row)의 개수 반환
			if(result ==0) {
				System.out.println("행이 추가되지 않았습니다.");			//no가 primary Key이기 때문에(Not null, Unique가 충족되어야 하므로 중복 insert는 안됨)
			}else {
				System.out.println("정상적으로 행이 추가되었습니다.");
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(ps != null)
				{
					ps.close();
				}
				if(con != null) 
				{
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}