package ch18;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("test4.txt");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}

}
