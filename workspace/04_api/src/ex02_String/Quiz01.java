package ex02_String;

import java.util.Scanner;

//시간을 입력받아서 출력하기
//시간을 입력하세요>>> 9
//분을 입력하세요>>> 5
//초>>> 30
//9:05:30
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int hour = 0;
		int minute = 0;
		int second = 0;
	
		System.out.print("시간을 입력하세요>>> ");
		hour = sc.nextInt();
		System.out.print("분을 입력하세요>>> ");
		minute = sc.nextInt();
		System.out.print("초를 입력하세요>>> ");
		second = sc.nextInt();
		
		String strHour = hour + "";
		String strMinute = minute  + "";
		String strsecond = second + "";		
		if(strMinute.length() == 1) {	//if(minute <10) {
			strMinute = "0" + minute;
		}
		if(strsecond.length() == 1) {	//if(second <10) {
			strsecond = "0" + second;
		}
		
		System.out.println(strHour + ":" + strMinute + ":" + strsecond );
	}

}
