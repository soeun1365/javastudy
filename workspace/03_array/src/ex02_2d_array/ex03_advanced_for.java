package ex02_2d_array;

public class ex03_advanced_for {

	public static void main(String[] args) {
		int[][] a= {
				{1,2},
				{3,4,5}
		};
		
		//a => a[0], a[1] 이 어디있는지 주소가 저장되어있음
		
		//a[0] ->{1,2}
		//a[1] ->{3,4,5}

		for(int[] b : a ) {
			for(int n :b) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
