package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

//문제
//임의의 Member를 3명 만들어 저장하고,
//사용자로부터 회원번호를 입력 받아서 해당 회원의 삭제를 진행하시오

	public static void main(String[] args) {
		
		Member m1 = new Member(1000,"user1",new Date(System.currentTimeMillis()));
		Member m2 = new Member(1001,"user2",new Date(System.currentTimeMillis()));
		Member m3 = new Member(1002,"user3",new Date(System.currentTimeMillis()));
		
		List<Member> members = new ArrayList<>();
		
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원번호를 입력하세요.(1001~1003) >>> ");
		int mNo = sc.nextInt();
		
		int removeIdx =-1;	//삭제할 회원의 인덱스	//없다고 생각한것 
		
		int length = members.size();
		for(int i=0; i<length;i++) {
			//members.get(0) ==m1
			if(members.get(i).getMNo() == mNo) {
				removeIdx = i;
				break;
			}
		}if (removeIdx == -1) {	//못찾은것
			System.out.println(mNo + "번 회원번호를 가진 회원이 없습니다.");
		}else {
			members.remove(removeIdx);
			System.out.println(mNo + "번 회원번호를 가진 회원 정보를 삭제했습니다.");
		}
		
		//Member클래스는 toString()메소드가 오버라이드 되어 있으므로
		//System.out.println(m1);	처럼 출력이 가능합니다.
		System.out.println("한번에확인 ");
		System.out.println(members);
		
		System.out.println("순회");
		for(Member member: members) {
			System.out.println(member);
		}
		sc.close();
	}

}
