package ch13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		for(int i=1; i<=5; i++) {
			v.add(i);
		}
		
		
		Enumeration e = v.elements();
		System.out.println("Print Enumeration");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator it = v.iterator();
		System.out.println("Print Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
