package ch12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] patterns = {".", "[a-z]?", "[0-9]+", "[0-9]*", "^[0-9]", "[^0-9]", 
						   "[a-z]*", "[a-z]+", "02|010", "\\s", "\\S", "\\d", "\\w", "\\W"};
		String[] data = {"bat", "021231234", "12345", "011", "bed", "02", "A", "9", "a", "*"};
		
		for(String d:data) {
			System.out.print("Matching patterns of "+d+": ");
			
			for(String p:patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			
			System.out.println();
		}

	}

}
