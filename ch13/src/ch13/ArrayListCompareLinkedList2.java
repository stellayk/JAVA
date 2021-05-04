package ch13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aList = new ArrayList();
		LinkedList lList = new LinkedList();
		
		for(int i=0; i<100000; i++) {
			aList.add(i);
			lList.add(i);
		}
		
		System.out.println("Add on ArrayList");
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			aList.add(500, i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		System.out.println("Add on LinkedList");
		start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			lList.add(500, i);
		}
		
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
