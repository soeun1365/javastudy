package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz {

	public static void main(String[] args) {
		
		//임의의 3명의 staff을 삽입하세요.
		//반복문과 배열 사용
		
		Connection con = null;
		PreparedStatement ps = null;
		
		int[] noList = {3,4,5};
		String[] nameList = {"james","soeun","hyoseong"};
		String[] departList = {"청소","분배","조리",};
		String[] hireDateList = {"20/02/02","97/02/03","97/01/27"};
		
		try {
			con= DBConnection.getConnection();
			String sql="INSERT INTO staff VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			
			int result = 0;
			for(int i = 0 ; i < noList.length ; i++){
				ps.setInt(1, noList[i]);
				ps.setString(2, nameList[i]);
				ps.setString(3, departList[i]);
				ps.setString(4, hireDateList[i]);	//주로 데이터베이스에서 날짜데이터는 String으로 변환해서 처리함 빨라서
				
				result += ps.executeUpdate();	//정상실행일 경우 result에 1을 더해주고 실패할경우 0을 더해줌
			}
			System.out.println("총 " + result + "명의 staff가 삽입되었습니다.");
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
