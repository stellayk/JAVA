package ch12.string;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hello, my name is Stella.";
		
		System.out.println("index 0: "+text.charAt(0));
		
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
	}
}
