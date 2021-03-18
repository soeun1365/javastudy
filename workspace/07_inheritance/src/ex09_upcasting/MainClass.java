package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {
		
//업캐스팅이 없는경우
//타입이 다르다: 커피마다 커피를 담는 컵이 다르다.
		Espresso espresso = new Espresso("콜롬비아", 100);
		Latte latte = new Latte("인도네시아", 100, 150);
		
		espresso.info();
		espresso.taste();
		latte.info();
		latte.taste();

		System.out.println("==========================================");
		
//	업캐스팅을 사용	{같은 컵에 내용물만 다른것이 효율성있음}
//	==> 타입이 같음: 모든 커피를 같은 컵에 담는다.
		Coffee coffee1 = new Espresso("콜롬비아", 10);
		Coffee coffee2 = new Latte("인도네시아", 100, 150);
	
		coffee1.info();
		coffee1.taste();
		coffee2.info();
		coffee2.taste();
	}

}
