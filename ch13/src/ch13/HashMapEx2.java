package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap();
		
		String[] names = {"Brandon", "April", "Katie", "Jinny", "Stella"};
		
		int [] nums = {1234, 5678, 8888, 9843, 2341};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//only key from Map
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+"="+map.get(key));
		}
		
		System.out.println("Print Iterator");
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String a = (String) it.next();
			System.out.println(a+"="+map.get(a));
		}
	}

}
