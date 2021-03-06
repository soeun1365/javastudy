package ex02_2d_array;

//3.6.9 게임 결과 저장하고 출력하기
//1 2 짝 4 5 짝 7 8 짝 10
//11 12 짝 14 15 짝 17 18 짝 20
//...     				  29
//짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
//...
//..... 100까지
public class Quiz03 {

	public static void main(String[] args) {
		
		//1~100을 matrix에 채우기
		//3,6,9 검사해서 "짝"으로 바꿔 저장하기
		String[][] martix = new String [10][10];
		for(int i=0 ; i < martix.length ; i++) {
			for(int j=0 ; j < martix[i].length ; j++) {
				
				int n = (i * 10) + (j+1);	//n은 1~100 사이의 값
				
				//1의 자리와 십의 자리로 분리하기
				int units = n % 10 ;	//1의자리
				int tens = n / 10 ;	//10의자리
				
				//369 검사
				boolean check1 = units == 3 || units ==6 || units ==9 ;
				boolean check2 = tens == 3 || tens ==6 || tens ==9 ;
				
				if(check1 && check2) {
					martix[i][j]="짝짝";
				}else if(check1 || check2) {
					martix[i][j]="짝";
				}else {
					martix[i][j] = n+"";		// String.valueOf(n);
				}
				System.out.print( martix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
