package ex07_recursive;

public class SayHello {

	public void say(int n) {
		if(n > 0) {	
			System.out.println("HELLO");
			say(n - 1);	//재귀적 호출
			//n-1된값으로 재쥐적 호출됨
			//n=1까지 진행됨, 0일때 끝나게 함
		}
	}
	
}
