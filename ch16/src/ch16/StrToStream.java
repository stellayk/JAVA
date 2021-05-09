package ch16;

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java world";
		
		IntStream isr = str.chars();
		
		isr.forEach(s -> System.out.print((char)s));
	}

}
