package ex01_array;

public class Ex02_advanced_for {

	public static void main(String[] args) {
		// advanced - for : 향상 for문
		// 배열의 순회를 인덱스 없이 처리하는 for문
		
		int[] arr= {10, 20, 30};
		for(int n: arr) {	//arr배열에 모든 요소를 변수 n으로 하나씩 전달합니다. -자동화
			System.out.println(n);
		}
		
		//모든 배열의 요소를 1증가
		//arr[0]++, arr[1]++, arr[2]++
		for(int n: arr) {	
			n++;	//arr배열의 요소가 증가했나요? no, 배열의 값을 가지고 있는 변수가 증가한것 
		}
		
		//advanced-for문은 배열의 요소를 수정할 수는 없다.
		//index를 활용하는 일반 for문이 배열의 요소를 수정할 수 있다.
		for(int i=0 ; i< arr.length ; i++) {
			arr[i]++;						// arr[i]+=1;
			System.out.println(arr[i]);
		}

	}

}
