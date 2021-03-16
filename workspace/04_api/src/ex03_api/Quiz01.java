package ex03_api;

public class Quiz01 {

//String과 StringBuilder의 성능비교
	//1~100000을 모두 연결 (12345678910111213141516171819...~100000)
	//각 클래스별로 연결에 소요된 시간을 ns(나노초)단위로 출력
	public static void main(String[] args) {
		
	//1. String
		String str ="";
		long start1 = System.nanoTime();
		for(int n = 1 ; n <= 100000 ; n++) {
			str+= n;
		}
		long end1 = System.nanoTime();
		System.out.println("String 경과시간: " + (end1 - start1) + "ns");
		System.out.println("String 경과시간: " + ((end1 - start1)/1000000000.0) + "초");
		
	//2. StringBuffer
		StringBuilder sb = new StringBuilder();
		long start2 = System.nanoTime();
		for(int n = 1 ; n <= 100000 ; n++) {
			sb.append(n);
		}
		long end2 = System.nanoTime();
		System.out.println("StringBuffer 경과시간: " + (end2 - start2) + "ns");
		System.out.println("StringBuffer 경과시간: " + ((end2 - start2)/1000000000.0) + "초");
		
	}
}
