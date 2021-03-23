package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {
	public static void main(String[] args) {
	
	Map<String, String> me = new HashMap<String, String>();
	
	me.put("name", "안소은");
	me.put("age", 25 + "");
	me.put("phone", "010-5590-1365");
	
	//향상 for문은 key를 뺍니다. (key를 이용해서 value를 빼기 때문입니다.)
	//me에서 key만 빼는 메소드 : keySet()
	
	Set<String> keys = me.keySet();	//key를 알아야 value를 뺄수 있다
	for(String key : keys) {
		System.out.println(key + ": " + me.get(key));
	}
	
	//2. Iterator 인터페이스
	Iterator<String> itr = keys.iterator();	//itr이터레이터는 1회용이다. 
	while(itr.hasNext()) {
		String key = itr.next();
		String value = me.get(key);
		
		System.out.println(key +": "+ value);
	}
	
	//3. 데어터 쌍(pair)으로 뺄 수 있습니다.
	//entry: key와 value를 묶어서 entry라고 합니다.
	//key : getKey()
	//value : getValue()
	
	Set<Map.Entry<String, String>> entrys = me.entrySet();
	
	//1. for
	for(Map.Entry<String, String> entry : entrys) {
		String key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + ": " + value);
	}
	//2. Iterator
	Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
	while(itr2.hasNext()) {
		Map.Entry<String, String> entry = itr2.next();
		String key = entry.getValue();
		String value = entry.getValue();
	}
	}
}