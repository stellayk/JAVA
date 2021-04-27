package p125;

public class CopyArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//original array
		int[] arrInt= {1,2,3};
		
		//array to copy
		int[] arrInt2 = new int[5];
		
		//insert value
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		
		//print value
		for(int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
		
	}

}
