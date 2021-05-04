package ch13.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet
		Set set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		set.add(new Member("Tom", 40));
		set.add(new Member("Tom", 40));		

		System.out.println(set);
	}

}
