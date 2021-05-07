package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "Sam");
		hm.put("id", "s101");
		hm.put("age", 50);
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "Michelle");
		hm.put("id", "m101");
		hm.put("age", 30);
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "Kim");
		hm.put("id", "k101");
		hm.put("age", 40);
		list.add(hm);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("index: "+i
							+", name: "+list.get(i).get("name")
							+", id: "+list.get(i).get("id")
							+", age: "+list.get(i).get("age"));
		}
	}

}
