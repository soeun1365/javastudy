package ex02_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		// for문
		// 1. 반복의 횟수나 범위가 명확할 때 사용합니다.
		// 2. 배열이나 리스트와 같은 반복가능 객체 (iterable)에서 사용합니다.
		// 3. 동작순서
		// for( ① ; ② ; ④ ){ ③ }
		//①은 최초 1회만 동작합니다.
		//②③④는 반복합니다.
		
		// 1~10 출력
		
		for(int n=1 ; n<=10 ; n++) {	//n++대신 n+=1도 가능
			System.out.println(n);
		}
	
		// 10~1 출력
		for(int m=10 ; m>=1 ; m--) {
			System.out.println(m);
		}

		//3번 hello java를 출력하는 for문
		for(int i = 0 ; i<3 ; i+=1) {	// 0부터 시작하는것을 추천 가독성문제
			System.out.println("hello java");
		}
	}

}
