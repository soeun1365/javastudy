package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
		/*switch (key){
		case value:
			break;
			default:
				break}
		*/

		//key값에는 정수, 문자형 가능
		
		int choice = 1;
		switch(choice) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("1과 2가 아니다.");
			break;		//default에는 break 안넣음
						//default는 마지막에 배치고 어짜피 끝나기 때문에 불필요, 없어도 어짜피 switch는 끝남
		}
		//위의 break를  세개 모두 안쓰면 case 1이 해당되면 case2, case3 이 사라짐, 비교 불필요하기때문 그래서 syso3개가 다 나와버림
		//break를 일부러 안넣고 함께 처리하는 고급스킬도 있음
	}

}
