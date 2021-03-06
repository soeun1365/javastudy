package ex02_2d_array;

import java.util.Scanner;

//성적 관리 프로그램
//각 점수는 입력 받아서 학생별 총점과 과목별 총점을 구해서 출력하기
//스폰지밥의 국어 점수>>> 10
//스폰지밥의 영어 점수>>> 10
//스폰지밥의 수학 점수>>> 10
//...
//출력부
//			국어		영어		수학		학생총점
//스폰지밥	10		10		10		30
//타요		10		10		10		30
//브레드		10		10		10		30
//과목합계	30		30		30		90

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"뽀로로", "타요","브레드","과목합"};
		String[] subjects = {"국어","영어","수학","학생합"};
		int[][] scores = new int[names.length][subjects.length];
		
		for(int i =0 ; i< names.length - 1 ; i++) {	//이름이 아닌게 하나 있기 때문에 1뺌
			for(int j =0 ; j<subjects.length -1 ; j++) {//과목이 아닌게 하나 있기 때문에 1뺌
				System.out.print(names[i] + "의" + subjects[j] + "점수 입력>>> ");
				scores[i][j] = sc.nextInt();
				//각각의 점수: scores[i][j]
				//과목의 합계: scores[names.length - 1][j]
				//학생의 합계: scores[i][subjects.length - 1]1
				//전체의 합계: scores[names.length - 1][subjects.length - 1]
				
				scores[names.length -1][j] += scores[i][j];
				scores[i][subjects.length -1] += scores[i][j];
				scores[names.length - 1][subjects.length - 1] += scores[i][j];
			}
			System.out.println();
		}
		//제목출력
		System.out.println("\t");
		for(String subject: subjects) {
			System.out.print( "\t"+ subject);
		}
		System.out.println("\t");	//두번째 줄로 넘어가기 위한 줄바꿈코드
		for(int i=0 ; i<scores.length ; i++) {
			System.out.print(names[i] + "\t");
			for(int j =0 ; j< scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
			
		}
	}
}
