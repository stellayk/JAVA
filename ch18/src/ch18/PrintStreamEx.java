package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("print.txt", true);
			PrintStream ps = new PrintStream(fos);
			ps.println("abc");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			ps.flush();
			ps.close();
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
