package ch16;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("list() method to Stream");
			Path path = Paths.get("src");
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName()));
			
			System.out.println("find() method to Stream");
			Stream<Path> sr2 = Files.find(path, 10, 
					(p, BasicFileAttributes) -> {File file = p.toFile();
					return !file.isDirectory() && file.getName().contains("Stream");});
			sr2.forEach(p -> System.out.println(p.getFileName()));
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
