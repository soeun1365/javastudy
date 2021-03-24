package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface UpdateMainClass {
	
		public static void main(String[] args) {
			
			Connection con = null;
			PreparedStatement ps = null;
			
			try{
				con = DBConnection.getConnection();
				String sql ="UPDATE staff SET department =? WHERE no = ? ";		//오라클은  =과 ==을 나누지않고 =하나만 사용한다. WHERE	조건절의 =은 ==로 인식됨	
				ps = con.prepareStatement(sql);
				ps.setString(1, "영업");
				ps.setInt(2, 3);
				int result = ps.executeUpdate();
				if(result == 0) {
					System.out.println("정보가 수정되지 않았습니다.");
				}else {
					System.out.println("정상적으로 정보가 수정되었습니다.");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps != null) {
						ps.close();
					}if(con != null) {
						con.close();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
}
