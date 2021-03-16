package quiz12;

public class Seat {
	
	//field
	private String name;	//예매자 이름
	
	//constructor
	
	//method
	//1. 예매자 이름확인
	public String getName() {
		return name;
	}
	//2. 예매 할때 예매자 이름 저장
	public void setName(String name) {
		this.name = name;
	}
	//3. 예매취소
	public void cancel() {
		this.name = null;	// 빈좌석으로 만들기
	}
	//4. 예매 여부 확인
	//1) 예매가 된 좌석 : false(예매 불가를 의미)
	//2) 예매가 안된 좌석 : true(예매가 가능을 의미)
	public boolean check() {
		return (name == null);
	}
	//5. 좌석 확인
	public void info() {
		if (name == null) {
			System.out.println("가능");
		}else {
			System.out.println("name");
		}
	}
	
}
