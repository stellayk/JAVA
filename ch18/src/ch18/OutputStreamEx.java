package ch18;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			OutputStream out = System.out;
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('2');
			out.write('c');
			out.write('!');
			out.write('@');
			out.write('#');
			
			out.flush();
			out.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
