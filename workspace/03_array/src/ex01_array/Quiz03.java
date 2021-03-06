package ex01_array;
//성적관리 프로그램
//학생들의 점수를 입력받아서
// 평균, 최대, 최소 점수를 출력한다.

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리","안소은"};
		int[] scores = new int[students.length];
		
		
				
		for(int i = 0 ; i< scores.length ; i++) {
			System.out.print(students[i] + "점수를 입력하세요>>> ");
			scores[i] = sc.nextInt();
		}
		int total_score = scores[0]; 	//초기화 점수를 첫번째것으로 씀
		int max_score = scores[0];		//초기화 점수를 첫번째것으로 씀
		int min_score = scores[0];		//초기화 점수를 첫번째것으로 씀
		// 첫 번째 학생의 점수는 제외하고 합계, 최소값, 최대값을 구해야함
		// 인덱스를 0이 아닌 1부터 사용하겠다는것
		
		String max_member = students[0];
		String min_member = students[0];
	
		for(int i = 1 ; i< scores.length ; i++) {
			total_score += scores[i];
			
			if(min_score > scores[i]) {	//현재 저장된 최소값보다 더 작은 값이 있다면
				min_score = scores[i];
				min_member = students[i];
			}
			
			if(max_score< scores[i]) {	//현재 저장된 최소값보다 더 큰 값이 있다면
				max_score = scores[i];
				max_member = students[i];
			}	
		}
		
		
		System.out.println("학생들의 점수 평균: "+ (double)total_score/scores.length + "점");
		System.out.println("최소 점수: "+ min_score + "점 (" + min_member + ")");
		System.out.println("최대 점수: "+ max_score + "점 (" + max_member + ")");

	}

}
