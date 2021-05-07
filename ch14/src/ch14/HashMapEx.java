package ch14;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "Sam");
		hm.put("id", "s101");
		hm.put("age", 50);
		
		System.out.println(hm.get("name"));
		System.out.println(hm.get("id"));
		System.out.println(hm.get("age"));
	}

}
