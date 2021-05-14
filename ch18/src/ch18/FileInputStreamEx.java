package ch18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("src/ch18/InputStreamEx.java");
			
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
	}

}
