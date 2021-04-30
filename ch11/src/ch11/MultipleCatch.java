package ch11;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
			System.out.println(3/0);
			Integer.parseInt("a");
		} catch(ArithmeticException e) {
			System.out.println("cannot be divided by 0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("illegal index of array");
		} catch(Exception e) {
			System.out.println("exception");
		}
	}

}
