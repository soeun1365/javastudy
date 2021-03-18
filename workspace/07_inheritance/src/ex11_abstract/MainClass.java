package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {
		
		Staff staff = new SalaryMan("alice", 300);
		staff.info();
		
		//staff의 getPay()는 어떻게 호출할 수 있나요?
		//staff.getPay();
		//방법1. Staff클래스에 getPay()추가합니다.
		//방법2. SalaryMan클래스로 캐스팅합니다. (down-casting)
		//		((SalaryMan)staff).getPay();
		//이경우에는 방법2 캐스팅보다는 방법1이 더 효율성있음
		//모든 Staff는 어짜피 getPay를 가져야하기 때문
		
		System.out.println(staff.getPay());
	}

}
