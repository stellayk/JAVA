package ch16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("Arrays.stream() IntStream");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.range(1, 6) IntStream");
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1, 5) IntStream");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s -> System.out.print(s+"\t"));
	}

}
