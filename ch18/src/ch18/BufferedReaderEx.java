package ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/ch18/InputStreamEx.java");
			br = new BufferedReader(fr);
			
			String txt = null;
			
			while ((txt = br.readLine()) != null) {
				System.out.print(txt);
			} 
		} catch(IOException e) {
				
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}		
	}
}
