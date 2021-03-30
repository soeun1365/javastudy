package ex05_synchronized;

public class MainClass {

	public static void main(String[] args) {
		
		//청소기 1대
		Dyson v11 = new Dyson();
		
		//엄마, 아빠 (스레드가 2개)
		Mama mama = new Mama();
		Papa papa = new Papa();
		
		
		//청소기 하나만 가지고 엄마, 아빠가 동시에 개별로 실행됨
		mama.setDyson(v11);
		mama.start();
		
		papa.setDyson(v11);
		papa.start();
	}

}
