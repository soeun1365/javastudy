package ex02_String;

import java.util.Scanner;

//정수, 실수 판별하기
//입력>>> 120
//120은 정수입니다.

//입력>>> 3.14
//3.14는 실수입니다.
public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = null;
		
		System.out.print("입력>>> ");
		num = sc.next();
		
		if(num.indexOf(".")==-1) {
			System.out.println(num + "은(는) 정수 입니다.");
		}else {
			System.out.println(num + "은(는) 실수 입니다.");
		}
		
	}

}
