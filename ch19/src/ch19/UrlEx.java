package ch19;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class UrlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL url = null;
			url = new URL ("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
			
			System.out.println("Authority: "+url.getAuthority());
			System.out.println("Content: "+url.getContent());
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host: "+url.getHost());
			System.out.println("Port: "+url.getPort());
			System.out.println("Path: "+url.getPath());
			System.out.println("File: "+url.getFile());
			System.out.println("Query: "+url.getQuery());
			
			int data = 0;
			
			try {
				Reader is = new InputStreamReader(url.openStream());
				while ((data=is.read()) != -1) {
					System.out.print((char)data);
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
