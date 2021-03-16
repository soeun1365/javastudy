package ex03_input;

import javax.swing.JOptionPane;

public class Quiz06 {

	public static void main(String[] args) {
		
		//주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력하기
		
		String s_no = JOptionPane.showInputDialog("주민번호를 하이픈 없이 입력하세요");
		
		int no = Integer.parseInt(s_no);
		String message1 = "남자입니다.";
		String message2 = "여자입니다.";	
		
		if(no==1 || no==3) {
			JOptionPane.showMessageDialog(null, message1);
		}else if(no==2 || no==4) {
			JOptionPane.showMessageDialog(null, message2);
		}	
		
	
	}

}
