package ch13;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list = new Vector();
		
		//list method
		list.add(1.2);
		list.add(Math.PI);
		list.addElement(3.4);
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		double num = 3.4;
		
		//list index
		int index = list.indexOf(num);
		if(index>=0) {
			System.out.println("index of "+num+": "+index);
		} else {
			System.out.println(num+" is not in the list.");
		}
		
		num = 1.2;
		if(list.contains(num)) {
			list.removeElement(num);
			System.out.println(num+" removed");
		}
		
		System.out.println(list.indexOf(num));
		System.out.println(list);
	}

}
