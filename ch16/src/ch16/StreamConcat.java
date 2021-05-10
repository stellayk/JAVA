package ch16;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> stream1 = Stream.of("a", "b", "c", "d", "e");
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.print(a + ","));
	}

}
