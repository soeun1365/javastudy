package ex01_random;

import java.util.Scanner;

//가위바위보
//가위바위보>>> 가위
//Player는 가위, Computer는 보, 이겼습니다.
//가위바위보>>> 바위
//Player는 바위, Computer는 바위, 비겼습니다.
//가위바위보>>> 보
//Player는 보, Computer는 가위, 졌습니다.
//1승 1무 입니다.
public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] rsp = {"가위", "바위", "보"};
		
		int win=0;
		int draw=0;
		
		loop:				//라벨값 붙임
		while(true) {

			System.out.print("가위바위보>>> ");
			String Player = sc.next();
			
			int player = 0;	//가위는 바로 0로 초기화 되어있음
			
			switch(Player) {
			case "바위":
				player = 1 ;
				break;
			case "보":
				player = 2;
			}
			
			System.out.print("Player는  " + Player+ ", ");
		
			int computer = (int)(Math.random() * 3 ) + 0;	//String[] rsp의 인덱스를 랜덤하게 뽑음
			System.out.print("Computer는  " + rsp[computer]);
			
			//player		:0,1,2
			//Computer		:0,1,2
			//	diff 		= player - computer
			//	1)이긴경우 :	-2, -1
			//	2)비긴경우 : 	0
			//	3)지는경우 :	else 이외의 값
			
			switch(player - computer) {
			case -2: case 1:
				System.out.println(", 이겼습니다.");
				win++;
				break;
			case 0:
				System.out.println(", 비겼습니다.");
				draw++;
				break;
			default:
				System.out.println(", 졌습니다.");
				break loop;		//라벨로 끝나는 지점을 알려줌
			}
		}
		System.out.println(win + "승 " + draw +"무");
		sc.close();
	}

}
