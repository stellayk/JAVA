package ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap();
		
		String[] names = {"Brandon", "April", "Katie", "Jinny", "Stella"};
		
		int [] nums = {1234, 5678, 8888, 9843, 2341};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//only values from Map
		Collection values = map.values();
		
		for(Object i : values) {
			System.out.println(i);
		}
		
		System.out.println("Print Iterator");
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
