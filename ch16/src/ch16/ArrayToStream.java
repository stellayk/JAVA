package ch16;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
	}

}
