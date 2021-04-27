package p127;

public class ArrFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array
		int[] arrInt = {1,2,3,4,5};
		
		//print by for
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		//print by for better ver.
		for(int number : arrInt) {
			System.out.println(number);
		}
	}

}
