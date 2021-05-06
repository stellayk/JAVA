package ch13;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap();
		
		String[] names = {"Brandon", "April", "Katie", "Jinny", "Stella"};
		
		int [] nums = {1234, 5678, 8888, 9843, 2341};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		System.out.println(map);
		System.out.println("Brandon's number: "+map.get("Brandon"));
	}

}
