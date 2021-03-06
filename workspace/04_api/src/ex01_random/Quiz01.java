package ex01_random;
//임시비밀번호 발급하기
//영문대문자 + 아라비아숫자 조합 6자리
//약 5:5 정도로

public class Quiz01 {

	public static void main(String[] args) {
		
		//////////////////////////  방법1  //////////////////////////
		char[] charSet = {'0','1','2','3','4','5',
						  '6','7','8','9','A','B',
						  'C','D','E','F','G','H',
						  'I','J','K','L','M','N',
						  'O','P','Q','R','S','T',
						  'U','V','W','X','Y','Z'
						  };
		
		
		//인덱스를 랜덤하게 생성합니다. 0<= random < charSet.length
		
		String tempPw = "";	// 문자열을 더해줄것이므로 빈 문자열로 초기화

		for(int n=0 ; n < 6 ; n++) {		//6번 반복한다
			int idx = (int)(Math.random() * charSet.length ) + 0 ;	//0부터 시작하는 charSet개의 정수형 숫자 하나 랜덤으로 나옴
			tempPw += charSet[idx];
		}
		System.out.println(tempPw);
		
		//////////////////////////  방법2  //////////////////////////
		
		//문자==정수
		//아스키코드값
		//'0' = 48  -->0에서 9까지 랜덤으로 구하려면 아스키코드값은 48~57 사이의 값중 랜덤으로 뽑으면 됨
		//'A' = 65	-->									65 ~ 90
		//'a' = 97	-->									97 ~ 122
		//위 코드를 사용하면 방법1의 charSet을 안만들 수 있음
		
		String tempPw2 = "";
		
		for(int n=0 ; n < 6 ; n++) {
			if(Math.random()<0.5) {
				int arabia =(int)(Math.random() * 10) + '0';		//int arabia =(int)(Math.random() * 10) + 48;		같은것임
				tempPw2 += (char)arabia;
			}else {
				int alphabet = (int)(Math.random() * 26 ) +'A';
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);
	}

}
