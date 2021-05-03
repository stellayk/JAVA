package ch12;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"a", "b", "c", "d"};
		Arrays.fill(arr, "e");
		for(String n : arr) System.out.print(n + ",");
		
		System.out.println();
		Arrays.fill(arr, 1, 3, "X");
		for(String n : arr) System.out.print(n + ",");
	}

}
