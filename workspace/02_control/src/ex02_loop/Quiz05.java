package ex02_loop;

import java.util.Scanner;

// 10000원 모두 사용하기
// 현재 10000원이 있습니다.
// 결제금액 >>> 5000(입력받기)
// 현재 5000원이 있습니다.
// 결제금액 >>>-100
// -100원은 결제할 수 없습니다.
// 현재 5000원이 있습니다.
// 결제금액>>> 10000
// 5000원이 부족합니다.
// 현재 5000원이 있습니다.
// 결제금액>>> 5000
// 현재 0원이 있습니다.

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money=10000;
		int pay =0;
		int nomoney= 0;

		System.out.println("현재 10000원이 있습니다.");
		while(true) {
			if(money == 0) {
				break;
			}
			System.out.print("결제금액>>> ");
			pay = sc.nextInt();
			
			if(pay< 0) {
				System.out.println(pay + "원은 결제할 수 없습니다.");
			}else if(pay > money) {
				System.out.println(pay - money + "원이 부족합니다.");
			}else {
			money -= pay;
			System.out.println("현재" + money + "원이 있습니다.");
			}	
		}
		sc.close();
	}

}
