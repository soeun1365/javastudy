package ex01_array;

/*
 	배열(Array)
 	1. 변수가 여러 개 필요할 때 사용합니다.
 	2. 같은 이름 + 식별번호 통해서 표현합니다.
 	3. 선언
 		1) int[] a = new int[3];	//int타입의 변수를 3개를 사용할 수 있는 배열 a 생성
 		2) int[] a;
 		   a= new int[3];
 		3) int a[] = new int[3];	//추천하지는 않습니다. 기본적으로 타입 뒤에 []브라켓을 붙임
 									//3)은 java의 뿌리인 C언어의 형태임
 	4. 초기화
 		1) int[] a = {10, 20, 30};
 		2) 주의 사항: 아래는 안됩니다, 초기화는 반드시 선언할 때 같이 진행합니다.
 			int []a;
 			a={10, 20, 30};
 	5. 생성되는 변수
 		int[] a = new int[3];
 		-->> a[0], a[1], a[2] 세개 모두 0으로 초기화가 되어있는 상태(자동초기화)
 	6. 용어
 		int[] a = new int[3];
 		1) 배열이름: a
 		2) 배열의 길이 : 3 (a.length)
 		3) 인덱스: 0,1,2 (0부터 시작한다.)
 			사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException 예외가 발생하바니다.
 */
public class Ex01_array {

	public static void main(String[] args) {
		
		// 1. 배열의 선언 및 생성
			int[] a = new int[3];
		
		//2. 확인
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
		
		//3. 배열의 순회
			//인덱스가 기준입니다.
			//인덱스: 0 ~ 배열의 길이 -1       -->>      0 >= 인덱스 <배열의길이
			for(int i=0 ; i<a.length ; i++) {
				System.out.println(a[i]);
			}
		//4. 가용 범위 벗어난 인덱스를 사용해 봅니다.
			//System.out.println(a[3]);

	}

}
