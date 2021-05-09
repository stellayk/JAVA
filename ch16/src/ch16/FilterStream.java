package ch16;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("ABC", "BEW", "ACW", "DLO", "ACW", "FEP");
		
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));
	}

}
