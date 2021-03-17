package quiz12;

import java.util.Scanner;

public class SeatGroup {
	
	//field
	private char seatType;	///'S', 'R', 'A', 'B
	private int charge;		//요금
	private Seat[] seats;
	private Scanner sc= new Scanner(System.in);
	
	//constructor
	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount];	//배열만 생성
		//배열에 실제 Seat 생성 작업
		for(int i = 0 ; i < seatCount ; i++) {
			seats[i] = new Seat();//빈좌석 생성
		}
	}
	
	//method
	//1. 예약
	//	1)결과타입: boolean (성공 true, 실패, false)
	//	2)메소드명: reservation
	//	3)매개변수: 없다.
	public boolean reservation() {
		// 좌석 번호(seatNo) : 1 ~ 10
		// seats 배열 인덱스 : 0 ~ 9
		System.out.print("예매할 좌석 번호 >>> ");
		int seatNo = sc.nextInt();
		//사용자가 예매하려는 시트는 seats[seatNo - 1] 입니다.
		//1. 예매 번호 확인
		if(seatNo <1 || seatNo >seats.length) {
			System.out.println(seatNo + "번은 없는 좌석입니다. 예약을 다시 시도하세요.");
			return false;
		}
	
		//2. 예매 여부 확인
		if(seats[seatNo - 1].check()) {
			System.out.print("예매자의 이름을 입력하세요 >>> ");
			String name = sc.next();
			seats[seatNo - 1].setName(name);
			System.out.println(seatNo + "번 좌석이 " + name + "님에게 예약되었습니다.");
			return true;
		}else {
			System.out.println(seatNo + "번 좌석은 이미 예약된 좌석입니다.");
			return false;
		}
	}
	
	//2.예매 취소
	//	1)결과타입: boolean (성공 true, 실패, false)
	//	2)메소드명: cancel
	//	3)매개변수: 없다.
	public boolean cancel() {
		System.out.print("예매 취소자의 이름을 입력하세요 >>> ");
		String name = sc.next();
		for(int i = 0 ; i < seats.length ; i++) {
			if(seats[i].getName() != null || seats[i].getName().equals(name)) {
				System.out.print("예매를 취소하시겠습니까?(Y/N) >>> ");
				String yesNo = sc.next();
				yesNo = yesNo.charAt(0) + "";	//yesNo.substring(0,1)
				if(yesNo.equalsIgnoreCase("Y")){
					seats[i].cancel();
					System.out.println("예매가 취소되었습니다.");
					return true;
				}
			}else {
				System.out.println("예매 취소가 취소되었습니다.");
				return false;
			}
		}System.out.println(name + "이름의 예약자가 없습니다. 다시 시도하세요.");
		return false;
	}
	
	//3. 예매 현황 출력
	public void info() {
		System.out.print(seatType + " : ");
		for(int i = 0 ; i< seats.length ; i++) {
			seats[i].info();
			System.out.print(" ");
			
		}
	}
	
	//4. 현재 좌석 타입의 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for(Seat seat : seats) {
			if(!seat.check()) {	//예약이 된 좌석
				total += charge;
			}
		}return total;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
}