package ch12;

public class EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1==str2) {
			System.out.println("str1 object is equal to str2 object");
		} else {
			System.out.println("str1 object is not equal to str2 object");
		}
		
		if(str1.equals(str2)) {
			System.out.println("String str1 is equal to String str2");
		} else {
			System.out.println("String str1 is not equal to String str2");
		}
	}

}
