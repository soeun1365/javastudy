package ex02_loop;

import java.util.Scanner;

//비밀번호를 "asdf"로 가정합니다.
//비밀번호를 입력받아서 일치하면 "로그인되었습니다."
//일치하지 않으면 "비밀번호를 확인하세요."
//최대 5번 입력을 받을 수 있습니다.
//5번 실패하면 "비밀번호 입력 횟수를 초과했습니다."출력
public class Quiz03 {

	public static void main(String[] args) {
		String pwd = "asdf";
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			if(count ==5) {
				System.out.println("비밀번호 입력 횟수를 초과했습니다.");
				break;
			}
		System.out.print("비밀번호를 입력하세요>>> ");
			
		pwd = sc.next();
		count ++;
			if(pwd.equals("asdf")) {
				System.out.println("로그인되었습니다.");
				break;
			}else {
				System.out.println("비밀번호를 확인하세요.");
			}
			
		}
	
	}
}

