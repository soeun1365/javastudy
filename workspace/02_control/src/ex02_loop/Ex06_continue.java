package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		// continue문
		// 1. loop문으로 되돌아가서 다시 실행합니다.
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용합니다.
		
		/*
		int n=1;
		while(n<=10) {
			if(n%2 ==1) {	//홀수는 출력합니다.
				System.out.println(n);
			}
			n++;
		}
		*/
		
		/*
		int n = 1;
		while(n<=10){
			if(n%2 ==0) {	//짝수는 while문으로
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		*/
		
		for(int i=1 ; i<=10; i++) {
			if(i%2 ==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//소원을 3개 들어줍니다.
		//안 되는 소원은 "로또당첨"입니다. 나머지 소원은 모두 들어줍니다.
		
		/*
		Scanner sc = new Scanner(System.in);
		String wish = null;
		for(int i=1; i<=3; i++) {
			System.out.print("소원을입력하세요>>> ");
			wish = sc.next();
			
			if(wish.equals("로또당첨")) {
				System.out.println("로또당첨은 안됩니다.");
				break;
			}
		}
		*/
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String wishList ="";
		while(count <3) {
			System.out.println("소원을입력하세요>>> ");
			String wish = sc.next();
			if(wish.equals("로또당첨")){
				continue;
			}
			wishList += wish;
			count++;
		}
		System.out.println(wishList);
		
			sc.close();
	}
	
}
