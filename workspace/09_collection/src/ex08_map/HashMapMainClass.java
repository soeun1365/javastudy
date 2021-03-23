package ex08_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMainClass {

/*
	HashMap클래스
	
	1. Map 인터페이스를 구현한 클래스입니다.
	2. 데이터를 쌍(pair)으로 저장하는 클래스입니다.
	3. 키(Key)-값(value)의 쌍으로 저장됩니다.
		1)키(Key) : 중복이 불가능합니다.	//집집마다 키는 다 다름
		2)값(value) : 중복이 가능합니다.	//집집마다 티비는 같을 수 있음
	4. 인덱스의 역할을 키(key)가 수행합니다.
*/
	
	public static void main(String[] args) {
		
		Map<String, Integer> sungjuk = new HashMap<>(); 	//Map하고 자동완성하기, 일반적으로 key는 String을 사용함
		
		//1. 추가: put(key, value);
		sungjuk.put("지구력", 80);
		sungjuk.put("근력", 70);
		sungjuk.put("인내력", 90);		
		sungjuk.put("지구력", 100);		//동일한 key가 추가된다고 오류나진 않고 덮어써짐
		
		
		//2. 삭제: remove(key);	
		sungjuk.remove("근력");
		
		
		//3. 요소 가져오기: get(key)		//인덱스 역할 하는게 key이므로 key를 써줌
		System.out.println("지구력: " + sungjuk.get("지구력"));
	
		
		//4. 크기
		System.out.println("저장된 데이터 개수: "+ sungjuk.size());
		
		
		//5. 출력
		System.out.println(sungjuk);
	
		
		//6. 순회
		//방법이 많아서 따로 진행합니다.
		
		
	}

}
