package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		
		//클래스에 생성자가 없는 경우에는
		//디폴트 생성자가 자동으로 사용됩니다. : 전달이 불가능함
		//public Person() { }
		
		Person p = new Person();
		
		p.setName("david");
		p.setAge(20);
		p.setKorean(false);

		System.out.println("이름: " + p.getName());
		System.out.println("나이: " + p.getAge());
		System.out.println(p.getKorean() ? "한국인" : "외국인");
	}

}
