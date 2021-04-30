package ch12.string;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello, my name is Stella";

		System.out.println(str.charAt(5));
		System.out.println(str.equals("Hello, my name is Stella."));
		System.out.println(str.indexOf("Stella"));
		System.out.println(str.substring(17));
		System.out.println(str.substring(6, 14));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("Stella"));
		System.out.println(str.replace("Stella", "Thom"));
		System.out.println(str.replaceAll("name", "nickname"));
		System.out.println(str.toString());
		
		str = "  Hello,  nice to meet you.  ";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		str = String.valueOf(10);
		str = String.valueOf(10.5);
		
		str = "A,B,C,D";
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.println("index "+i+": "+arr[i]);
		}
	}

}