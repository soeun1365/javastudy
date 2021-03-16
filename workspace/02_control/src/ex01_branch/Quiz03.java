package ex01_branch;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
			
			// switch사용
			// 나이 입력 받아서 "성인", "미성년자
	
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력>>> ");
		
		int age = sc.nextInt();
		int state = (age>0 && age<20) ? 1:(age>=20)? 2 : 3;
		
		switch(state) {
		case(1): System.out.println("미성년자");
		break;
		case(2): System.out.println("성인");
		break;
		case(3): System.out.println("입력 값 오류");
		}
		
		
		/*
		 	switch (age/10){
		 	case 0: //age 1~9
		 	
		 	case 1:	//age 10~19
		 	System.out.println("미성년자");
		 	break;
		 	
		 	case2 :	//age >=20
		 	sSystem.out.println("성인");
		 	}
		 	
		 */
		sc.close();
	}

}
