package ex01_random;

//윷놀이
//"도", 1칸이동합니다.
//"개", 2칸이동합니다.
//"걸", 3칸이동합니다.
//"윷", "개" 6칸이동합니다.
//"모", "모" "도" 11칸이동합니다.
public class Quiz03 {
	public static void main(String[] args) {
		String[]yut = {"도","개","걸","윷","모"};
		int move = 0;	//이동횟수
		
		while(true) {
			int idx = (int)(Math.random() * 5) +0 ;
			System.out.print("\""+ yut[idx] + "\"");	//"도" ~"모" 출력
			
			//이동횟수 계산합니다.
			move += idx +1;
			
			//도, 개, 걸 은 끝낸다.
			if(idx <3) {
				System.out.println(", " + move + "칸 이동합니다.");
				break;
			}
			//윷, 모 는 또 던진다.
			else{
				System.out.print(", ");
			}
		}
		
	}
}
