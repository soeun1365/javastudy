package quiz12;

import java.util.Scanner;

public class ConcertHall {

	//field
	private String hallName;
	private char[] seatTypes = {'S','R','A','B'};
	private int[] seatCounts = {10, 10, 10, 10};
	private int[] charges = {200000, 150000, 100000, 50000};
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);
	
	//constructor
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[seatTypes.length];	//4개, 배열만 생성
		//seatGroup 생성
		for(int i = 0 ; i < seatGroups.length ; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}
	
	//method
	public void run() {
		while(true) {
			manu();
			System.out.print("작업선택 >>> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : reservation(); break;
			case 2 : cancel(); break;
			case 3 : inquiry(); break;
			case 4 : info(); break;
			case 5 : exit(); return;//run()메소드를 종료
			default : System.out.println("잘못된 작업입니다. 다시 시도하세요.");
			}
		}
	}
	public void manu() {
		System.out.println("====== 예매 프로그램 ======");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 프로그램 종료");
		System.out.println("===========================");
	}
	//예약
	public void reservation() {
		System.out.print("예매할 좌석 타입(S, R, A, B) 입력>>> ");
		char seatType = sc.next().charAt(0);//char만 입력받는 것은 없음
		for(int i = 0 ; i < seatTypes.length ; i++) {
			if(seatType == seatTypes[i]) {
				seatGroups[i].reservation();
			}
		}
	}
	//취소
	public void cancel() {
		System.out.print("예매 취소할 좌석 타입(S, R, A, B) 입력>>> ");
		char seatType = sc.next().charAt(0);//char만 입력받는 것은 없음
		for(int i = 0 ; i < seatTypes.length ; i++) {
			if(seatType == seatTypes[i]) {
				seatGroups[i].cancel();
			}
		}
	}
	//조회
	public void inquiry() {
		System.out.print("조회할 사용자 이름입력 >>> ");
		String name = sc.next();
		for(int i = 0 ; i < seatGroups.length ; i++) {	// S, R, A, B
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
			for(int j = 0 ; j < seats.length ; j++) {
				if(seats[j].getName() != null && seats[j].getName().equals(name)) {
					System.out.println(seatTypes[i] + "타입 " + (j+1) + "번 좌석이 " + name + "에게 예약되어있습니다.");
					return;
				}
			}
		}System.out.println(name + " 님의 예매 정보가 없습니다.");
	}
	//전체 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for(SeatGroup seatGroup : seatGroups) {
			total += seatGroup.getTotalCharge();
		}return total;
	}
	//전체 예매 현황
	public void info() {
		System.out.println("홀: " + hallName);
		System.out.println("예매총액: " + getTotalCharge() + "원");
		for(SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
			System.out.println();
		}
	}
	//프로그램 종료
	public void exit() {
		System.out.println(hallName + "예매프로그램을 종료합니다.");
		sc.close();
	}
}
