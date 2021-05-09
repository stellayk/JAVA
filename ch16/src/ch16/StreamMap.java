package ch16;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("hi", "nice", "to meet", "you");
		
		System.out.println("function interface");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
		System.out.println();
		
		System.out.println("method");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));
	}

}
