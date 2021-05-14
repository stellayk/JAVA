package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlConnectionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		BufferedReader br = null;
		String readline = "";
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while ((readline = br.readLine()) != null) {
				System.out.println(readline);
			}

		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch(Exception e) {}
		}
	}

}
