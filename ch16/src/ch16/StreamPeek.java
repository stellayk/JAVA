package ch16;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		list.parallelStream()
		.mapToDouble(a -> a.area())
		.peek(a -> System.out.println(a)).sum();
		
		boolean result = list.stream()
							.allMatch(a -> (a instanceof Shape));
		System.out.println("All elements are objects of Shape. -> "+result);
		
		boolean result2 = list.stream()
							.anyMatch(a -> (a instanceof Rectangle));
		System.out.println("Rectangle objects -> "+result2);
		
		boolean result3 = list.stream()
							.noneMatch(a -> (a instanceof Circle));
		System.out.println("Circle objects -> "+result3);
	}

}
