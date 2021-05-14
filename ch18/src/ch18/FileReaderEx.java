package ch18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		
		try {
			fr = new FileReader("src/ch18/InputStreamEx.java");
			int data = 0;
			
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			} 
		} catch(IOException e) {
				
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}		
	}
}
