package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {

		/*무한루프 만들기
		while(true) {
			System.out.println("무한루프입니다.");
		}
		*/
		
		
		// 1~10 출력
		int n = 1;
		while (n<=10) {	//n이 1~10인 경우 while(true)
			System.out.println(n++);
		}
		
		System.out.println();
		
		
		int j =10;
		while (j>=1) {
			System.out.println(j--);
		}
		
		
		
		//'A' ~ 'Z' 사이를 계속 입력 받는 프로그램
		// 대문자가 입력되지 않으면 종료하니다.
		
		
		char ch = 'A';	//처음부터 돌아갈수 있도록 초기값을 대문자로 해둠while(괄호)안의 값이 true이도록
		Scanner sc = new Scanner(System.in);
		
		while(ch>='A' && ch<='Z') {			//while(ch>=65 && ch<=90) {
			System.out.println("대문자 입력>>> ");
			ch = sc.next().charAt(0);
		}
		
		
		
		//입력 받은 정수를 모두 더해줍니다.
		//0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		
		int i = 0;	//최초 진입을 위한 0 (true)
		int sum = 0;
		
		while(i >= 0) {
			System.out.println("정수를 입력하시오");
			i= sc.nextInt();
			sum += i;
		}
		
		sum -= i;		//i값에 음수를 넣었을때 while에서 빠져나오는데 이미 sum에서 뺴줬기때문에 (-)(-) -->(+) 인것을 활용
		System.out.println( "합계는 "+ sum + "입니다.");
	}

}
