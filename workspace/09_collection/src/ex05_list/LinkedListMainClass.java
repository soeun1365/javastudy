package ex05_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	LinkedList클래스
	1. List 인터페이스를 구현한 클래스입니다, 제네릭 사용
	2. 생성방법
		1) LinkedList<E> list = new LinkedList<E>();
		2) List<E> list = new LinkedList<E>();		--> 	 List가 슈퍼클래스니까
	3. 연결리스트를 구현한 클래스입니다.
	   자동으로 길이를 조정합니다.
	4. 장점: 모든 위치에 추가, 삭제가 빠르다. 
	   단점: 순차적인 접근이느리다.
	5. 추가삭제가 자주 발생하지 않는 시스템에 사용하면 좋다
*/
public class LinkedListMainClass {

	public static void main(String[] args) {
		
		//ArrayList와 LinkedList의 사용법은 같습니다.
		
		//성능비교
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		//1.추가 (인덱스 0에 데이터 추가)
		long start1 = System.nanoTime();	//십억분에 일초 타임
		for(int n = 0; n <=10000 ; n++) {
			list1.add(0, n);
		}
		long end1 = System.nanoTime();
		System.out.println("ArrayList 삽입 소요시간: " + (end1 - start1) + "ns");
		//집어놓고 밀고 집어놓고 밀고 ... 집어놓고 9999개 밀고
		System.out.println("=========================================================");
		
		long start2 = System.nanoTime();	//십억분에 일초 타임
		for(int n = 0; n <=10000 ; n++) {
			list2.add(0, n);
		}
		long end2 = System.nanoTime();
		System.out.println("LinkedList 삽입 소요시간: " + (end2 - start2) + "ns");
		//하나 만들고 링크 만들고...
		System.out.println("=========================================================");
		//2. 순회
		long start3 = System.nanoTime();
		for(int i =0, length = list1.size(); i< length ; i++) {
			list1.get(i);
		}
		long end3 = System.nanoTime();
		System.out.println("ArrayList 순회 소요시간: " + (end3 - start3) + "ns");
		//훨씬 빠를것으로 예상
		
		System.out.println("=========================================================");
		long start4 = System.nanoTime();
		for(int i =0, length = list1.size(); i< length ; i++) {
			list2.get(i);
		}
		long end4 = System.nanoTime();
		System.out.println("LinkedList 순회 소요시간: " + (end4 - start4) + "ns");
	}

}
