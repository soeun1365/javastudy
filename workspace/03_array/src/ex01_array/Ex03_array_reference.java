package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		// 배열은 reference type입니다.
		
		int[] arr = new int[3];
		System.out.println(arr); 	//new int[3]을 통해 생성된 배열 요소들의 주소가 저장되어 있다. 	// [I@edf4efb

		// 배열의 길이를 조정하는(일반적으로 늘리는 작업) 코드입니다.
		
		//<<<새로운 배열만들고 갈아타기>>>
		
		int[] a = {1, 2, 3};	//배열 a의 길이: 3
		int[] b = new int[10];	//배열 b의 길이: 10
		
		//b[0] = a[0], b[1] = a[1] , b[2] = a[2]
		for(int i =0 ; i<a.length ; i++) {
			b[i] = a[i];
		}
		// a에는 {1,2,3}이 저장된 주소가 있ㅅ브니다.
		// b에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있습니다.
		
		a=b; 			//a에는 b {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있습니다.
		
		//배열 a의 길이가 증가했습니다.
		for (int i =0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//기존의 a 메모리는 누수가 발생함(쓰레기값 남음), 메모리에 데이터가 있지만,, 그 주소값을 가지고있는 애가 없어서 사용을 못함
		//이것을 JVM이 알아서 제거해줌 자기 하고싶을때.. : Garbage Collection (GC)
		//코드 작성이 있지만 코드 한다고해서 바로 실행되는것도 아님, JVM에게 독촉 정도임..
		//Code:System.gc();
		
	}
}
