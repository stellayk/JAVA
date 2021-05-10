package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		try {
			Map<Object, List<Shape>> map = list.stream().collect(Collectors.groupingBy(f -> f.getClass()));
			
			System.out.println("print rectangle");
			map.get(Class.forName("ch16.Rectangle")).stream().forEach(f -> System.out.println(f));
			
			System.out.println("print circle");
			map.get(Class.forName("ch16.Circle")).stream().forEach(f -> System.out.println(f));
			
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
