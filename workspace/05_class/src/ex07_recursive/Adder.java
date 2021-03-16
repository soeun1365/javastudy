package ex07_recursive;

public class Adder {
	//field
	private int total;	//필드라서 초기화 0으로 되어있음	private int total=0; 이렇게 하지말것
	
	public void calculate(int n) {
		if(n == 0) {
			return;	//method를 끝내는코드
			//결과타입이 void인 경우에만 return;을 통해서 메소드를 종료합니다.
		}
		total += n;
		calculate(n-1);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
