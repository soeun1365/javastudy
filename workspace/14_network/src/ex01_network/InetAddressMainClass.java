package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		//원격호스트
		String host = "www.naver.com";
		//인터넷 주소를 알아내는 InterAddress
		InetAddress ia = null;
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);						//domain + ip	: www.naver.com/125.209.222.142
			System.out.println(ia.getHostName());		//domain		: www.naver.com
			System.out.println(ia.getHostAddress());	//ip			: 125.209.222.142
			InetAddress[] ias = InetAddress.getAllByName(host);		//등록된 ip가 여러개일경우
			for(InetAddress i : ias) {
				System.out.println(i.getHostName() + "의 ip주소: " + i.getHostAddress());
			}
			
			byte[] byteip = ia.getAddress();	//1바이트는 8비트
			System.out.println(Arrays.toString(byteip));	//byte타입은 -128~127의 숫자를 표현할 수 있어서 출력 하면 -값 붙은게 뜸
		
			short[] ip = new short[byteip.length];
			for(int i = 0; i < ip.length ; i++) {
				ip[i] = (short)(byteip[i] < 0 ? byteip[i]+256 : byteip[i]);		//음수로 나왔을경우 256을 더해주기
			}
			System.out.println(Arrays.toString(ip));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
