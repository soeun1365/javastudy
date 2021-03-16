package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Answer06 {

	public static void main(String[] args) {
		
		//주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력하기
		System.out.println("주민번호 입력(하이픈없이)>>> ");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		char GenderNum =id.charAt(6);
		
		//방법1
		//String gender = (GenderNum == '1' || GenderNum == '3') ? "남자" : "여자";
		//System.out.println("성별은 " + gender + "입니다.");
		
		//방법2
		String gender = (GenderNum % 2 == 1) ? "남자" : "여자";		
		System.out.println("성별은 " + gender + "입니다.");
		//이방법은 되는것 처럼! 보임
		//문자는 코드값을 가지고 있습니다.
		//문자는 연산하는 경우 "코드값"이 연산됩니다.
		//'1'%2 --> 49(아스키코드값) % 2
		//'2'%2 --> 50(아스키코드값) % 2
		
		//알아두면 좋은 코드값
		//'0' :48
		//'A' :65
		//'a' :97
		
		sc.close();
	
	}
}
