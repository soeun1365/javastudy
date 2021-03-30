package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrowling {

	public static void main(String[] args) {
	
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		
		try {
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while((line = br.readLine()) != null) {
				//line : <a href="https://search.daum.net/search?w=tot&amp;q=%EA%B0%95%EC%8A%B9%EC%9C%A4+1%EC%9C%84&amp;DA=NPI&amp;rtmaxcoll=NNS" class="link_favorsch @9">강승윤 1위</a>
				//이와같이 link_favorsch만 포함된 line이 필요합니다.
				if(line.contains("link_favorsch @")) {
					//System.out.println(line);
					//String[] temps = line.split(">");	//'>'기준으로 자른다
					//System.out.println(temps[1]);		//'>'기준으로 자른것 중에 뒤에 것
					
					//line.split(">")[1] 					: 코로나19 발생현황</a
					//line.split(">")[1].split("<") 		: {"코로나19 발생현황", "/a"}
					//line.split(">")[1].split("<")[0];		: 코로나19발생현황 
					
					System.out.println(line.split(">")[1].split("<")[0]);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {br.close();}
				if(con != null) {con.disconnect();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
