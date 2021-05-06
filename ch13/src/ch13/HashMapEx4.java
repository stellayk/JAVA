package ch13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap();
		
		String[] names = {"Brandon", "April", "Katie", "Jinny", "Stella"};
		
		int [] nums = {1234, 5678, 8888, 9843, 2341};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//select as pairs
		Set entry = map.entrySet();
		
		for(Object o : entry) {
			Map.Entry m = (Map.Entry) o;
			System.out.println("key: "+m.getKey()+", value: "+m.getValue());
		}
	}

}
