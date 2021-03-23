package ex06_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMainClass {
/*
	HashSet 클래스
	1. Set 인터페이스를 구현한 클래스입니다.
	2. 기본특징
		1) 인덱스가 없습니다. 순서가없다. 먼저저장 그런거 없음
		2) 중복저장이 불가능합니다.
	3. 기본적인 사용법은 List와 같지만, 인덱스가 없음에 주의합니다.
	
*/
	public static void main(String[] args) {
		
	Set<String> set = new HashSet<>();
	
	//추가 - 일부러 중복을 만들어봄
	set.add("java");
	set.add("java");
	set.add("jsp");
	set.add("jsp");
	set.add("spring");
	set.add("spring");
	
	System.out.println("요소 개수: " + set.size());
	
	//일반 for문은 불가능, 향상for문 가능
	for(String s : set) {				
		System.out.println(s);	//출력할 때도 순서맘대로 나옴
	}
	
	}

}
