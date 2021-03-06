package ex01_random;

import java.util.Scanner;

//Up down 게임
//1~10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞추는 게임
//입력>>> 5000
//Up
//입력>>> 7500
//Down
//입력>>> 7499
//총 3번만에 정답입니다.

public class Quiz02 {

	public static void main(String[] args) {
		int top = 10000;
		int bottom =1;
		int correctNum =0;
		int inputNum = 0;
		int times=0;
		
		correctNum = (int)(Math.random()*10000) + 1;
		Scanner sc = new Scanner(System.in);
		
		//정답 미리보기
		System.out.println(correctNum);
		
		do {
		System.out.print("입력>>> ");
		inputNum = sc.nextInt();
		times++;
			//입력범위 체크
			if(inputNum < bottom || inputNum > top) {
				System.out.println(bottom + "~" + top +"범위를 입력하세요.");
				continue;
			}
			
			//비교합니다.
			if(correctNum == inputNum) {
				System.out.println("총 " + times + "번만에 정답입니다.");
			}
			else if(correctNum > inputNum) {
				System.out.println("Up");
				bottom = inputNum +1;
			}else{
				System.out.println("Down");
				top = inputNum -1;
			}
		}while(correctNum != inputNum);
		sc.close();
	}

}
