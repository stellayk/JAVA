package ch13;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5, 6));
		
		System.out.println("sum of area: "+ getArea(list));
		System.out.println("sum of length: "+ getLength(list));
	}
	
	private static double getArea(List list) {
		double value=0;
		
		for(int i=0; i<list.size(); i++) {
			Shape s = (Shape) list.get(i);
			value += s.length();
		}
		return value;
	}
	
	private static double getLength(List list) {
		double value=0;
		
		for(int i=0; i<list.size(); i++) {
			value += ((Shape) list.get(i)).area();
		}
		return value;
	}
}