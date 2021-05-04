package ch13.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object type array
		Object[] arr = {"Tom", "Eva", "Kim", "Julia", 1, 2, "1", "2"};
		
		//HashSet
		Set set = new HashSet();
		
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
