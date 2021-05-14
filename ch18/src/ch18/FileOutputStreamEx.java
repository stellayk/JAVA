package ch18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true);
			
			fos.write(68);
			fos.write(69);
			fos.write(70);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
