package p63;

public class AndOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 5;
		System.out.println(a==b & test());
		System.out.println(a==b && test());
	}
	
	public static boolean test() {
		System.out.println("test method");
		return true;
	}

}
