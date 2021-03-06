package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calendar {
	//날짜 시간 만들때 주로 씀

	public static void main(String[] args) {

		//java.util.calendar
		//1. 자바에서 날짜와 시간을 처리하는 주요 클래스
		//2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다. 필요한것만!
		
		//현재 날짜와 시간 생성
		Calendar date = Calendar.getInstance();	//이것은 무조건 오늘임
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1;	// ★★★★★★★★★ Calendar.Month: 0에서 11까지 나온다.  ★★★★★★★★★//0이 1월
		int day = date.get(Calendar.DAY_OF_MONTH);	//한달안에서의 하루
		int weekNo = date.get(Calendar.DAY_OF_WEEK);//요일 번호(일요일부터 1, 2, 3, ...)
		
		System.out.println(weekNo);
		
		String[] weekNames = {""+"월","화","수","목","금","토","일"};
		//요일번호랑 인덱스 번호랑 딱 같게 하려고 초반에 "" 빈 문자열 넣기
		
		System.out.println(year + "-" + month +"-" +day + weekNames[weekNo] + "요일");
		
		int ampm = date.get(Calendar.AM_PM);		//0오전, 1오후
		
		int hour = date.get(Calendar.HOUR);			//0부터 11사이(12시간제)
		int hour2 = date.get(Calendar.HOUR_OF_DAY);	//0부터 23사이(24시간제)
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);//천분에 일초
		
		System.out.println((ampm == 0 ? "오전":"오후") + " "+ hour2 + ":" + minute + ":" +  second + "." + millis);
		

		//날짜 변경하기
		date.set(2020, 10, 1, 10, 45, 41); 	//날짜: 2020년 11월 1일 10시 45분 41초(월 주의!!)
		System.out.println(date);
		
		//Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
		
		//Calendar -> java.sql.Date타입으로 바꿔주는 작업
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		//java.sql.Date -> Calendar
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
	}

}
