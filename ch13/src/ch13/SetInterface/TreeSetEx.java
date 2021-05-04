package ch13.SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet set = new TreeSet();
		
		String from = "bat";
		String to = "d";
		
		set.add("ant");
		set.add("alias");
		set.add("batman");
		set.add("aha");
		set.add("cola");
		set.add("Cola");
		set.add("ddr");
		set.add("dance");
		set.add("dEEE");
		set.add("deee");
		set.add("ever");
		set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		System.out.println("from:"+from+", to:"+to);
		
		System.out.println(set.subSet(from, to));
		System.out.println("from:"+from+", to:"+to+"zzzz");
		
		System.out.println(set.subSet(from, to+"zzzz"));
		
		
		set = new TreeSet(new Descend());
		set.add("ant");
		set.add("alias");
		set.add("batman");
		set.add("aha");
		set.add("cola");
		set.add("Cola");
		set.add("ddr");
		set.add("dance");
		set.add("dEEE");
		set.add("deee");
		set.add("ever");
		set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		System.out.println("from:"+from+", to:"+to);
		
		System.out.println(set.subSet(to, from));
	}

}
