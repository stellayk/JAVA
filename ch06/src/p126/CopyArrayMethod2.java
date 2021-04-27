package p126;

import java.util.Arrays;

public class CopyArrayMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//original array
		int[] arrInt= {1,2,3};
		
		//copy
		int[] arrInt2 = null;
		arrInt2 = Arrays.copyOf(arrInt, 5);
		
		//print value
		for(int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
