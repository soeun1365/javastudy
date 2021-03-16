package ex01_variable;

public class Ex05_casting {

	public static void main(String[] args) {
		
		//자동 형변환 (promotion casting)
		//데이터의 훼손이 없게 1이 1.0이 됨 1.5가 1이 되진 않음
		System.out.println(1+1.5);	//1+1.5  ->promotion(JVM)->1.0 +1.5
		
		//강제 형변환 casting: 다른 타입(자료형)으로 변환하는것
		int a= 1;
		double b=1.5;
		System.out.println(a+(int)b);	//강제로 1.5를 1로 잠시 int형으로 변환 시킴, 소수점 잘려나감
										//비 상식적 변환도 무조건 바꿔줌 
	}

}
