package quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.set("james", 50,60,70);		//인수: 이름, 국, 영, 수
		System.out.println("평균: " + s.getAverage());
		System.out.println(s.getPass());	//60이상 "합격", 나머지 "불합격
	}

}