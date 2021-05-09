package ch16;

import java.util.stream.Stream;

public class StreamByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//builder method
		Stream stream = Stream.builder()
									.add("A")
									.add("B")
									.add("C")
									.add("D")
									.build();
		
		stream.forEach(s -> System.out.println(s+" "));
		
		//generate method
		Stream<String> stream2 = Stream.generate(() -> "ABC").limit(5);
		
		stream2.forEach(s -> System.out.println(s));
		
		//iterate method
		Stream<Integer> stream3 = Stream.iterate(1, n -> n+1).limit(5);
		
		stream3.forEach(s -> System.out.println(s));
	}

}
