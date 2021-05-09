package ch16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("int stream");
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));
		
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s -> System.out.println(s));
		System.out.println();
		
		
		System.out.println("long stream");
		LongStream lsr = new Random().longs(3, 0, 10);
		lsr.forEach(s -> System.out.println(s));
		System.out.println();
		
		
		System.out.println("double stream");
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.println(s));
	}

}
