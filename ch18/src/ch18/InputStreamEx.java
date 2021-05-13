package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream in = System.in;
			int data=0;
			while( (data=in.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
	}

}
