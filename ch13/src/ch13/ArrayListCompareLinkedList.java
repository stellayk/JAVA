package ch13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aList = new ArrayList();
		LinkedList lList = new LinkedList();
		
		for(int i=0; i<100000; i++) {
			aList.add(i);
			lList.add(i);
		}
		
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		
		for(int i=0; i<aList.size(); i++) {
			aList.get(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		
		for(int i=0; i<lList.size(); i++) {
			lList.get(i);
		}
		
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
