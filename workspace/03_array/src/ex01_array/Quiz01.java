package ex01_array;
//길이가 3인 String 타입의 배열을 선언하고,
//3개의 이름을 입력 받아서 배열에 저장하고 확인하기

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<names.length ; i++) {
			
			System.out.println(i+1 + "번째 이름을 입력하세요");
			names[i] = sc.next();
		}
		/*
			for(변수 : 배열) {	
			}
		*/
	
		for(String nameList : names) {
			System.out.println(nameList);
		}
	
		//for(int i=0 ; i<names.length ; i++) {
			//System.out.println(names[i]);
		//}
	
		sc.close();
	}
}
