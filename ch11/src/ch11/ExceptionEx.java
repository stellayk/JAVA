package ch11;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
