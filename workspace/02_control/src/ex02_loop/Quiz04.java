package ex02_loop;

// 2*1=2  3*1=3 ... 9&1=9
// 2*2=4  3*2=6 ... 9&2=18
// 2*3=6  3*3=9 ... 9&3=27
// ...
// 2*9=18  3*9=27 ... 9&9=81

public class Quiz04 {

	public static void main(String[] args) {
		for(int n=1 ; n<=9 ; n++) {
		for(int dan=2 ; dan<=9 ; dan++) {
				System.out.print(dan + "*" + n + "=" + (dan * n) + "\t");	//탭키로 간격 동일하게 띄우기
			}
		System.out.println();
		}
	}

}
