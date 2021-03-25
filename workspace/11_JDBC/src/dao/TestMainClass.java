package dao;

public class TestMainClass {

	public static void main(String[] args) {
		
		//StaffDao 클래스의 getInstanc()를 호출할 수 있도록
		//추가작업해보기
		
		//방법1.객체를 이용한 호출(StaffDao()가 private라 이방법은 불가능)
		//방법2. 클래스 메소드로 바꿔야한다.(이것으로 해야함)
		
		StaffDao dao = StaffDao.getInstance();
		
		

	}

}