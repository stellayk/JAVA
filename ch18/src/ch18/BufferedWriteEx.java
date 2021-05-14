package ch18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("test4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write('A');
			char[] buf = {'B', 'C', 'D'};
			
			bw.write(buf);
			
			bw.write(buf, 1, 2);
			
			bw.write("Hello");
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
