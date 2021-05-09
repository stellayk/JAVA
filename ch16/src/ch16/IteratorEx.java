package ch16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList(new String[] {"A", "B", "C", "D"});
		
		System.out.println("for");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Inner stream");
		list.stream().forEach(s -> System.out.println(s));
	}

}
