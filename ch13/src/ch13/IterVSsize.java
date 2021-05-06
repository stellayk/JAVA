package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class IterVSsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		for(int i=0; i<100000000; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Iterator performing time: "+(end-start));
		
		
		start = System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("size() performing time: "+(end-start));
	}

}
