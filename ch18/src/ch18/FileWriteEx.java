package ch18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("test3.txt");
			
			fw.write('A');
			char[] buf = {'B', 'C', 'D'};
			
			fw.write(buf);
			
			fw.write(buf, 1, 2);
			
			fw.write("Hello");
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
