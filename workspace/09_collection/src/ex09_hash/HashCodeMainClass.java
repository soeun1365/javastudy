package ex09_hash;

/*
 	몇몇 아이디가 있습니다.
 	각각의 해시코드를 몇몇 규칙으로 생성해 봅니다.
 	정하는 사람 마음대로임
 	1) 첫글자에 따라서 해시코드를 정한다.
 	
 	  이름		 해시코드
 	'apple'			1	 
 	'africa'		1
 	'avatar'		1
 	'banana'		2
 	'bonus'			2
 	'bravo'			2
 	
 	2)글자수에 따라 해시코드를 정한다.
 	
 	  이름		 해시코드
 	'apple'			5	
 	'africa'		6
 	'avatar'		6
 	'banana'		6
 	'bonus'			5
 	'bravo'			5
 	
 	입력된 아이디를 검색하고자 합니다.
 	검색 속도를 높이기 위해서 "hash" 개념이 사용됩니다.
 	hash라는것은 어떤 숫자값이다.
 	
 	(((((검색예시)))))
 	검색 아이디: 'april'
 	사용 해시코드: 글자수
 	
 	(((((동작)))))
 	1)'april'의 해시코드를 구한다. => 5
 	2) 해시코드가 5인 'apple', 'bonus', 'bravo'중에서 'april'을 찾는다.
 	
 	빠른검색을 위해 해시코드를 도입하는것임
 	풀스캔 하지 않고 조건을 달아서 찾음
 	
*/

public class HashCodeMainClass {

	public static void main(String[] args) {
		
		Integer a =10;
		System.out.println("a의 해시코드: " + a.hashCode());
		
		Double b =1.5;
		System.out.println("b의 해시코드: " + b.hashCode());
		
		String str = "hello";
		System.out.println("hello의 해시코드" + str.hashCode());
		//지금까지 살펴 본 바
		//내장된 클래스타입의 객체들은 나름의 해시코드가 있습니다.
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog);					//객체의 메모리주소
		System.out.printf("%x\n", dog.hashCode());	//Object의 해시코드임 
		
		System.out.println(cat);					//객체의 메모리주소
		System.out.printf("%x\n", cat.hashCode());	//Object의 해시코드임
		
		//중요
		//Object의 hashCode()는 객체의 메모리 주소를 반환한다.
		//Object의 해시코드는 메모리 값이므로 같은값이 나올 수가 없음, 그래서쓰레기임, 풀스캔 하라는거니깐...
		//Object의 해시코드는 따로 만들어주어야함
		
		//hashSet과 hashMap의 공통점은
		//"중복이 불가능한 데이터"가 있다는 점입니다.
		
		//중복 확인 유무
		//1. 해시코드확인(hahsCode())합니다. 해시코드가 같아야 다음단계로 진행합니다. 같은데이터일 가능성 O
		//2. 실제로 같은지 equals()로 비교한다. 
		//3. 그 결과가 같으면 "중복 데이터"가 있는 것으로 판단합니다.
	}

}

class Dog{}
class Cat{}


