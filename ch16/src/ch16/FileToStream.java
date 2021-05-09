package ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Path path = Paths.get("src/ch16/StrToStream.java");
			Stream<String> stream = Files.lines(path, Charset.defaultCharset());
			stream.forEach(s -> System.out.println(s));
			stream.close();
			System.out.println();
			
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s));
			stream.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
