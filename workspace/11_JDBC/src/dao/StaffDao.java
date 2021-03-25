package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;

// DAO : Database Access Object [다우]
// DB의 CRUD를 처리하는 메소드를 포함하고 있습니다.
public class StaffDao {

	//field (기본 null상태)
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	//constructor (Singleton pattern패턴으로 제작)
	//1. 하나의 StaffDao만 생성할 수 있습니다.
	//2. 원리
	//	1) 외부에서는 new StaffDao()가 불가능하도록 설계합니다.
	//	2) 내부에서 new SattDao()를 실행하고 생성된 1개의 인스턴스를 반환하는 메소드를 만듭니다.
	//	3) getInstance()메소드 호출방법
	//		방법1.객체를 이용한 호출(StaffDao()가 private라 이방법은 불가능)
	//		방법2. 클래스 메소드로 바꿔야한다.(이것으로 해야함) static처리를 해줘야함(실행시점때문에 오류남)
	//			   static 처리는 compile때, new로 StaffDao는 run때
	//			   static에는 static만 넣을 수 있게 함
	//			   static 메소드는 static 필드만을 사용할 수 있습니다.
	
	private StaffDao() {}	//private로 외부에서 new안되고 
	private static StaffDao staffDao = new StaffDao();	//내부에서는 가능
	public static StaffDao getInstance() {
		return staffDao;
	}
	
	
	
	//method
	/***************1. 접속*****************/
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="spring";
		String password ="1111";
		return DriverManager.getConnection(url, user, password);
	}
	
	/***************2. 접속해제*****************/
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs != null){rs.close();}
			if(ps != null){ps.close();}
			if(con != null){con.close();}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/***************3. 가장 최근에 추가된 staff의 no알아내기*****************/
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				no = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, rs);
		}return no;
	}
	
	
	/***************4. staff추가하기*****************/
	//public int insertStaff(int no, String name, String department, Date hireDate) {
	public int insertStaff(StaffDto staffDto) {
		try {
			con = getConnection();  // 접속은 메소드마다 열고 닫는 것이 제일 좋습니다.
			sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			ps.setString(2, staffDto.getName());
			ps.setString(3, staffDto.getDepartment());
			result = ps.executeUpdate();  // executeUpdate() : INSERT, UPDATE, DELETE
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;  // 삽입되면 result는 1, 실패하면 result는 0
	}
	
	/***************5. staff수정하기*****************/
	public int updateStaff(StaffDto staffDto) {	//수정을 원하는 회원의 정보가 들어있음
		try {
			con = getConnection();
			sql = "UPDATE staff SET name =?, department =? WHERE no = ? ";						//if(staffDto.getName() ==null) { 		//이런식으로 조건을 주고 원하는 sql을 적어서 UPDATE할 수 있음
			ps = con.prepareStatement(sql);
			ps.setString(1, staffDto.getName());
			ps.setString(2, staffDto.getDepartment());
			ps.setInt(3, staffDto.getNo());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			close(con, ps, null);
		}
		return result;
	}
	
	/***************6. staff삭제하기*****************/
	//public int deleteStaff(int no) {
	public int deleteStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff WHERE no =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, null);
		}
		return result;
	}
	
	/***************7. staff조회하기*****************/
	public StaffDto selectOneByNo(int no) {	//반환타입이StaffDto하나임
		StaffDto staffDto = null;
		try {
			con = getConnection();
			sql ="SELECT no, name, department, hireDate FROM staff WHERE no =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();	//executeQuiery() : SELECT
			if(rs.next()) {			//P Key라서 유일함 한개인지만 확인
				staffDto = new StaffDto();		
				staffDto.setNo(rs.getInt(1));	//꺼낸 검색결과를 StaffDto에 넣어주자
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, rs);
		}
		return staffDto;
	} 

	/***************8. 전체staff조회하기*****************/
	 public List<StaffDto> selectList(){//반환타입은 List고, 그안에 StaffDto가 잔뜩 들음
	 
		 List<StaffDto> staffList = new ArrayList<>();
		 try {
			 con = getConnection();
			 sql ="SELECT no, name, department, hireDate FROM staff";
			 ps = con.prepareStatement(sql);
			 rs = ps.executeQuery();
			 while(rs.next()) {	//존재하면
				 StaffDto staffDto = new StaffDto();
				 staffDto.setNo(rs.getInt(1));				//rs.getInt("no")
				 staffDto.setName(rs.getString(2));			//rs.getInt("name")
				 staffDto.setDepartment(rs.getString(3));	//rs.getInt("department")
				 staffDto.setHireDate(rs.getDate(4));		//rs.getInt("hireDate")
				 staffList.add(staffDto);	//리스트에 staffDto 추가
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 close(con, ps, rs);
		 }return staffList;
	 }
}
	 








