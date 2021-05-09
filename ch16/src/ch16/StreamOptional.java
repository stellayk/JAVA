package ch16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		long count = Arrays.stream(arr).count();
		System.out.println("count: "+count);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum: "+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("First element: "+first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("Maximum: "+max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("Minimum: "+min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("Average: "+avg.getAsDouble());
	}

}
