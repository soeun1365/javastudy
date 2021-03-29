package ex02;

public class MainClass {

	public static void main(String[] args) {
		//Runnable 인터페이스를 구현한 스레드는
		// 1. 생성
		// 2. Thread로 변경
		// 3. 과정을 거칩니다.

		Player p1 = new Player("레이디버그");	
		Thread player1 = new Thread(p1);
		Player p2 = new Player("블랫캣");
		Thread player2 = new Thread(p2);
		//p1, p2는 객체 
		
		//Player1, Player2는 thread
		player1.start();
		player2.start();
	}

}
