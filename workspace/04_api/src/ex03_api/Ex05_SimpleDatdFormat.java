package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
  	날짜/시간 패턴(pattern)
  	1. 년: yy, yyyy
  	2. 월: M, MM
  	3. 일: d, dd
  	4. 요일: E (일~토)
  	5. 오전/오후: a(오전/ 오후)
  	6. 시간:
  		1) h, hh: 12시간제	//오전오후 쓸땐 24시간제 사용 X
  		2) H, HH: 24시간제
  	7. 분: m, mm
  	8. 초: s, ss
  	
 */

public class Ex05_SimpleDatdFormat {

	public static void main(String[] args) {
		
		Date date = new Date(System.currentTimeMillis());
		
		String pattern ="yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("non-pattern: " + date);
		System.out.println("pttern: " + sdf.format(date));
		

	}

}
