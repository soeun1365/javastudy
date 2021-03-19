package ex16_interface_extends;

public class Person {

	//method
	//1. Pet에게 food주기
	public void feed(Pet pet, String food) {
		pet.feed(food);
	}
	
	//2. Pet과 산책하기
	public void walking(Walkable pet) {		//Pet pet을 Walkable pet으로 변경하여서 new Dog 는 저장가능, new Snake는 저장 안되서 컴파일 오류생김
		System.out.println( "Walking with "+ ((Pet)pet).getName());
	}
}
