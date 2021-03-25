package dto;

import java.sql.Date;

// DB Table에 저장된 행(row)을 저장하는 클래스
// VO : value Object
// DTO : Data Transfer Object

// 테이블은 대문자로만 쓰기 때문에 자바에서 가독성이 떨어진다
// 테이블 칼럼	ㅣ	클래스 필드
//---------------------------------------
// Board_NO		ㅣ	board_no 또는 boardNo		※이름을 동일하게 지정해줘야함 나중에 오류 찾기 힘듦
//	BNO			ㅣ	nNO


//디폴트 생성자 필수
//	생성자 안만들면 디폴트생성자 사용되니깐 아예 안만들던가(일반적임, 필드를 이용한 생성자가 필요없을것같아.. 싶으면)
//	디폴트 생성자와 필드를 이용한 생성자 모두를 만든다(필드를 이용한 생성자가 필요할것 같아.. 싶으면)
//getter setter필수

public class StaffDto {

	//field
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
	//getter/setter	
	//롬복사용해도되고(@Data)	//데이터 입출력하는것이라getter setter필수
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "[no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
}
