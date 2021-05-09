package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptionalNoElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		long count = list.stream().count();
		System.out.println("count: "+count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum: "+sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		if(avg.isPresent()) {
			System.out.println("Average: "+avg.getAsDouble());
		}
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("Maximum: "+max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("Minimum: "+min);
		
		list.stream().mapToInt(Integer::intValue).findFirst()
			.ifPresent(a -> System.out.println("First element: "+a));
	}

}
