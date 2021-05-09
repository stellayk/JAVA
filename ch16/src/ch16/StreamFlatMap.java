package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("hi", "nice", "to meet", "you");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {
			String[] strArr = data.split(",");
			double[] dArr = new double[strArr.length];
			for(int i=0; i<dArr.length; i++) {
				dArr[i] = Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(dArr);
		});
		dsr.forEach(n -> System.out.println(n));
		System.out.println();
		
		List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] iArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				iArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(iArr);
		});
		isr.forEach(n -> System.out.println(n));
	}

}
