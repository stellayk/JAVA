package p66;

public class BitOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2:"+Integer.toBinaryString(2));
		System.out.println("3:"+Integer.toBinaryString(3));
		
		System.out.println("2&3: "+(2 &3));
		System.out.println("2|3: "+(2 |3));
		System.out.println("2^3: "+(2^3));
		System.out.println("~3: "+(+~3));
		
		System.out.println("~3 to binary:"+Integer.toBinaryString(~3));
		
		System.out.println(Integer.toBinaryString(~3).length());
		System.out.println(Integer.MAX_VALUE);
			}

}
