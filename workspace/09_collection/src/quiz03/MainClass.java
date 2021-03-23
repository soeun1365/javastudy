package quiz03;

import java.util.HashSet;
import java.util.Set;

//LOTTO번호 6개 HashSet에 보관하기
public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 6) {	//중복을 제외하고 6개 세기, 6개가 될때까지 뽑음
			lotto.add((int)(Math.random() * 45) + 1);	//1~45 중에 하나를 랜덤으로 뽑아 저장
		}
		System.out.println(lotto);
		
		


	}

}
