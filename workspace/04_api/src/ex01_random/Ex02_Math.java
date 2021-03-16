package ex01_random;

// Ex01_Random 보다 이 Math를 많이 씀

public class Ex02_Math {

	public static void main(String[] args) {
		
		//java. lang. Math 임폴트 필요없는 기본클래스
		
		System.out.println(Math.random()); 		// 0.0 <=  난수 <  1.0
		
		//Math.random()의 결과가 0.1보다 작을 확률은 얼마일까요?	--> 10%
		//Math.random()의 결과가 0.2보다 작을 확률은 얼마일까요?	--> 20%
		//크기비교로 확률 만들 수 있음
		
		//10% 확률로 "강화성공", 90% 확률로"강화실패"
		if(Math.random()<0.1) {
			System.out.println("강화성공");
		}else {
			System.out.println("강화실패");
		}
		
		//Math.random()					0.0 <= random < 1.0
		//Math.random() * 3	 			0.0 <= random < 3.0
		//(int)Math.random() *3			0   <= random < 3	정수형으로 캐스팅  -->0, 1, 2 중에 랜덤값 나옴
		//(int)Math.random() *3 + 1		1   <= random < 4	1을 더해줌 	  --> 1,2,3 중에 랜덤값 나옴
		
		//일반화해서 공식처럼 활용합니다.
		//원하는 난수의 범위를 만드는 법
		
		//==============================================//
		//		(int)(Math.random() * 개수) + 시작값  		//
		//==============================================//
		
		//(int)(Math.random() * 6) + 1 	-->1부터 6개	-->주사위
		int lotto = (int)(Math.random() * 45) + 1;	//-->1부터 45개	-->로또
		System.out.println(lotto);
		
	}

}
