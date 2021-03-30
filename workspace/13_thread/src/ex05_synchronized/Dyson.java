package ex05_synchronized;

//Critical section
//1. 임계영역
//2. 공유 자원을 관리하기 위해서 한 번에 한 스레드의 접근만 허용합니다.
//   "thread safe하다."라고 표현합니다.
//3. synchronized키워드를 추가합니다.

public class Dyson {
	//method
	
	//synchronized
	//한 스레드만 floorClenaing()나 homeCleaning에 접근할 수 있다.
	//동시 접근이 안된다.
	public synchronized void floorCleangin() {
		try {
			System.out.println("바닥 청소를 하고있다.");
			Thread.sleep(1000);		//1000밀리초: 1초 를 바닥청소할 시간 줌 (sleep도 try-catch필요함)
			notify(); 				//Object의 notify(알린다), 다른 스레드에게 floorCleanint()메소드가 끝났음을 알린다.
			wait(); 				//Object의 wait(기다린다), 다른 스레드가 다시 notify() 해줄때 까지 기다린다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안을 청소하고 있다.");
			Thread.sleep(1000);
			notify();
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
