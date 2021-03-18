package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("정찬성");	//에너지, 공격력은 랜덤생성
		Fighter fighter2 = new GolbalFighter("에드가");

		//선빵결정
		boolean myTurn = (Math.random() < 0.5);
		
		do {
			if(myTurn) {
				fighter1.attack(fighter2);		//fighter1이 fighter2를 공격
			}else {
				fighter2.attack(fighter1);		//fighter2이 fighter1를 공격
			}
		}while(fight1과 fighter2가 모두 살아있으면);	//반복조건
		
		
	}

}
