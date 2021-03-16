package ex01_array;
//String[] friendList = {"타요", "짱구", "스폰지밥"};
//새로 사귄 친구의 수를 입력 받아서,
//그 만큼 , friendList 배열의 길이를 늘이기

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		
		System.out.print("새로 사귄 친구의 수를 입력하세요>>> ");
		int inputNum = sc.nextInt();
		String[] temp = new String[inputNum + friendList.length];
		
		for(int i = friendList.length ; i<temp.length ; i++) {
			System.out.println("새친구 이름>>> ");
			temp[i] = sc.next();
		}
		
		for(int i=0 ; i<friendList.length ; i++) {
			temp[i] = friendList[i];
		}
		
		friendList = temp;
		
		System.out.println("총 친구 수 : " + temp.length);
			
		for(String friend : friendList) {
			System.out.println(friend);
		}
		
		sc.close();
	}
}
