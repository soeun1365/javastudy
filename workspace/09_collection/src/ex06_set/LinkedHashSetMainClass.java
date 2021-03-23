package ex06_set;

import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetMainClass {

	public static void main(String[] args) {
		
		//LinkedHashSet클래스는 저장된 요소들의 순서가 유지됩니다.
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("css");
		set.add("javascript");

		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
