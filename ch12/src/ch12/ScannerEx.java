package ch12;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int cnt=0;
		while(true) {
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			
			if("".equals(name)) break;
			
			System.out.println("Hi, "+name);
			cnt++;
		}
		
		System.out.println("Entered names: "+cnt);
	}

}
