package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("no order");
		list.stream().forEach(System.out::println);
		
		System.out.println("order by length");
		System.out.println("function interface");
		list.stream()
		.sorted(new Comparator<Shape>() {
			@Override
			public int compare(Shape s1, Shape s2) {
				return (int)(s1.length()-s2.length());
			}
		})
		.forEach(System.out::println);
		
		System.out.println("order by length using lambda expression");
		list.stream()
		.sorted((a,b) -> (int)(a.length()-a.length()))
		.forEach(System.out::println);
	}

}
