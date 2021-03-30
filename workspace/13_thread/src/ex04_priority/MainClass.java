package ex04_priority;

public class MainClass {

	public static void main(String[] args) {
		
		//스레드의 우선 순위
		System.out.println("가장 낮은 순위: " + Thread.MIN_PRIORITY);
		System.out.println("중간 순위: " + Thread.NORM_PRIORITY);
		System.out.println("가장 높은 순위: " + Thread.MAX_PRIORITY);
		//어떤 메소드를 먼저 처리해야할지 우선순위를 자바에게 알려줌
		
		//스레드 생성
		Thread homework = new Thread(new HomeWork());
		Thread watchTV = new Thread(new WatchTV());
		
		//Homework의 우선순위를 높이고, WatchTV의 우선순위를 낮추고싶다
		//확률을 높여줌 100%는 아님
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		//스레드 시작
		watchTV.start();
		homework.start();
	}

}
