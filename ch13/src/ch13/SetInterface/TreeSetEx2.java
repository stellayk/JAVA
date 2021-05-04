package ch13.SetInterface;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arrange by name
		TreeSet set = new TreeSet();
		
		set.add(new Member2("Tom", 30));
		set.add(new Member2("Alice", 50));
		set.add(new Member2("Bon", 70));
		System.out.println(set);
		
		//print by age desc
		TreeSet set2 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Member2 m1 = (Member2) o1;
				Member2 m2 = (Member2) o2;
				return m2.age-m1.age;
			}
			
		});
		
		set2.add(new Member2("Tom", 30));
		set2.add(new Member2("Alice", 50));
		set2.add(new Member2("Bon", 70));
		System.out.println(set2);
		
		//print by name
		TreeSet set3 = new TreeSet(new NameDesc());
		set3.add(new Member2("Tom", 30));
		set3.add(new Member2("Alice", 50));
		set3.add(new Member2("Bon", 70));
		System.out.println(set3);

		//print by age 
		TreeSet set4 = new TreeSet(new AgeDesc());
		set4.add(new Member2("Tom", 30));
		set4.add(new Member2("Alice", 50));
		set4.add(new Member2("Bon", 70));
		System.out.println(set4);
	}

}
