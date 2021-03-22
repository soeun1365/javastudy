package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("bio");
		p1.setDate("2021-03-01"); //날짜는 하이푼 or 슬래시 사용
		
		p2.setModel("CA-001");
		p2.setManufacturer("bio");
		p2.setDate("2021-03-05"); //날짜는 하이푼 or 슬래시 사용
		
		//같은종류의 제품p1,p2(model, manufacturer가 모두 같음)
		//하지만 제조일자가 다른 독립적인 제품
		
		//Object의 equals() 메소드 객체의 데이터를 비교하지 않고,
		//같은 주소에 저장된 객체인지 다른 주소에 저장된 객체인지 비교합니다.
		if(p1.equals(p2)) {	//자바는 new를 통해 만들어진 p1,p2이므로 무조다르다고 인식함
			System.out.println("같은종류의 제품입니다.");
		}else {
			System.out.println("다른종류의 제품입니다.");
		}
		
		//오브젝트의 equals()는 주소만 비교
		//String의 equals()는 캐릭터 배열을 사용해서 글자 하나씩도 비교
		
	}

}
