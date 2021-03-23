package quiz02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//1~10000 사이의 값을 가지고 있는 ArrayList를 두개 만들고,
//모든 요소를 하나씩 삭제합니다.

//1. 가장 성능이 나쁜 방법
//2. 가장 성능이 좋은 방법
public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		long start1 = System.nanoTime();
		for(int i = 0, length1 = list1.size(); i < length1 ; i++) { 
			list1.remove(0);
		}
		long end1 = System.nanoTime();
		System.out.println("가장성능이 나쁜 방법: " + (end1 - start1) + "ns");
		// 0번째 자리를 지우고 밀고 다시 0번째 자리 지우고
		
		
		List<Integer> list2 = new LinkedList<>();
		long start2 = System.nanoTime();
		for(int i = list2.size()-1; i >= 0 ; i--) {	
			list2.remove(i);
		}
		long end2 = System.nanoTime();
		System.out.println("가장성능이 좋은 방법: " + (end2 - start2) + "ns");
		//뒤에서부터 하나씩 지우고 넘어오기
		
	}

}
