package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
	Iterator 인터페이스
	1. Collection을 순회하는 경우에 사용합니다.
	2. "반복자" 라고 한다.
	3. 순회를 하고자 하는 Collection에 iterator()메소드를 부착해서 생성합니다.
	4. 인덱스가 없어도 사용할 수 있습니다.	- 순서가있던없던 상관이없음
	
*/

public class IteratorMainClass {	//이터레이터

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		//set를 순회할 수 있는 Iterator객체 생성
		Iterator<String> itr = set.iterator();	//인터페이스는 new불가능
												//set를 순회할 수 있는 itr객체 생성
		//메소드 종류
		//hasNext() : 다음 요소가 있으면 true, 없으면 false를 반환한다.
		//next() : 다음 요소를 가져온다.
		
		while(itr.hasNext()) {	//set에 남아있는 요소가 있으면
			String str1 = itr.next();	 //저장된 요소를 가져온다.
			System.out.println(str1);
		}

		List<String> list = new ArrayList<>();
		list.add("운동");
		list.add("뜨개질");
		list.add("요리");
		
		Iterator<String> itr2 = list.iterator();
		while(itr2.hasNext()) {
			String str2 = itr2.next();
			System.out.println(str2);
		}
	}

}
