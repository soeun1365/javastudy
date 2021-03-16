package quiz12;

import java.util.Arrays;
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
		for(int i = 0 ; i < seatGroups.length ; i++) {
			System.out.println(seatTypes[i]);
			System.out.println(Arrays.toString((Seat[])seatGroups[i].getSeats()));
		}
	}
}
