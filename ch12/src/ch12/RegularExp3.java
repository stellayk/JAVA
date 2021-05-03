package ch12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "Phone number:010-1111-1111, "
				+ "Home number:02-1234-5678, "
				+ "Email:email@gmail.com, "
				+ "Account:123-12-123456";
		
		String telpattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String emailpattern = "(\\w+)@(\\w+).(\\w+)";
		String accountpattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		
		Pattern pattern = Pattern.compile(telpattern);
		Matcher m = pattern.matcher(source);
		
		System.out.println("Phone number: ");
		while(m.find()) {
			System.out.println(m.group() + " : "
							 + m.group(1) +","+ m.group(2) +","+ m.group(3));
		}
		
		
		pattern = Pattern.compile(emailpattern);
		m = pattern.matcher(source);
		
		System.out.println("Email: ");
		while(m.find()) {
			System.out.println(m.group() + " : "
							 + m.group(1) +","+ m.group(2) +","+ m.group(3));
		}
		
		
		pattern = Pattern.compile(accountpattern);
		m = pattern.matcher(source);
		
		System.out.println("Account number: ");
		while(m.find()) {
			System.out.println(m.group() + " : "
							 + m.group(1) +","+ m.group(2) +","+ m.group(3));
		}
		

	}

}
