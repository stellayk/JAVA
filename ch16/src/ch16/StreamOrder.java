package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("hi", "nice", "to meet", "you");
		
		System.out.println("order");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("reverse order");
		list.stream().sorted(Comparator.reverseOrder()).
							forEach(System.out::println);
	}

}
