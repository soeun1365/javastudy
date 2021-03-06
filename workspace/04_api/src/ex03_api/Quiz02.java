package ex03_api;

import java.sql.Date;
import java.util.Calendar;

//Calendar를 활용해서 기념일 계산하기
//1) 두개의 날짜를 만들고, 그 중 하나는 기념일로 수정
//2) 날짜의 차이를 구하고, 일 수를 출력하기

public class Quiz02 {
	public static void main(String[] args) {
		
		Calendar aniversary = Calendar.getInstance();
		aniversary.set(2017, 8, 5);	//2017,09,05
		
		Calendar today = Calendar.getInstance();
		
		//둘다 타임스탬프로 바꿔서 차이를 구합니다.
		long elapseTime = today.getTimeInMillis() - aniversary.getTimeInMillis();
		
		//밀리초 단위를 일(1000밀리초 * 60 * 60 * 24 == 1일)단위로 변경
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24 );
		
		System.out.println("경과한 일수는 " + elapseDay + "일 입니다.");
	}
}
