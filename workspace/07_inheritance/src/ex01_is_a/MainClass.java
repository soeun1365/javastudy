package ex01_is_a;
//Student가 eat()을 사용하고자 합니다.
//상속을 이용한다
/* 
 	상속 (inheritance)
 	1. 어떤 클래스가 다른 클래스의 기능을 확장하는 것을 의미합니다.
 	2. 상속이 가능한 대표적인 클래스들의 관계는 is - a관계
 	3. Is - A
 		Person is a Student.	(X)
 		Student is a Person.	(O)		=>모든학생은 사람이다 ( Is - A 관계성립)
 	4. Student는 Person의 기능(메소드)를 확장할 수 있습니다.
 		
 */

/* 
	슈퍼클래스와 서브클래스
	1. 슈퍼클래스: 부모클래스라고도 합니다. 메소드를 다른 클래스에게 제공하는 클래스
					Person
	2. 서브클래스 : 자식클래스라고도 합니다. 다른 클래스(슈퍼클래스)의 메소드를 제공받는 클래스
	3. 형식
		class 슈퍼클래스{...}
		class 서브클래스 extends 슈퍼클래스{...}
*/
public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		Student s = new Student();
		
		p.eat();
		s.eat();
		s.study();
	}

}
