package ch13;

import java.util.ArrayList;
import java.util.List;

public class AddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
	}

}
