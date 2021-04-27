package p68;

public class BitShiftOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(3<<2);
		System.out.println("binary number of 3: "+Integer.toBinaryString(3));
		System.out.println("binary number of 12: "+Integer.toBinaryString(12));
		
		System.out.println(8>>2);
		System.out.println("binary number of 8: "+Integer.toBinaryString(8));
		System.out.println("binary number of 2: "+Integer.toBinaryString(2));
		
		System.out.println(-8>>>3);
		System.out.println("binary number of -8: "+Integer.toBinaryString(-8));
		System.out.println("-8>>>3: "+Integer.toBinaryString(-8>>>3));
	}

}
