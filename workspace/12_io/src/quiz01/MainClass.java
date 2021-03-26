package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//사용자로부터 국, 영, 수 점수를 입력받은 뒤,
// int[] 배열에 저장합니다.
//score.dat 파일에 이름, 입력 받은 점수, 평균을 저장하시오.

public class MainClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학"};
		int[] scores = new int[3];
		String name = "james";
		int total =0;
		double ave = 0;
			
		for(int i=0 ; i<subjects.length ; i++) {
			System.out.print(subjects[i] + "점수>>>");
			scores[i] = sc.nextInt();
			total += scores[i];
		}

		ave = total / subjects.length;
			
		System.out.println("평균: " +ave);
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt"))){
			dos.writeInt(subjects.length);
			dos.writeUTF(name);
			for(int score : scores) {
				dos.writeInt(score);
			}
			dos.writeDouble(ave);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}