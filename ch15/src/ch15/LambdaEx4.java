package ch15;

public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface4 li4 = (x, y) -> {
			return x*y;
		};
		System.out.println("multiple: "+li4.cal(3, 2));
		
		li4 = (x, y) -> x+y;
		System.out.println("add: "+li4.cal(3, 2));
		
		li4 = (x, y) -> {return x/y;};
		System.out.println("divide: "+li4.cal(3, 2));
		
		li4 = (x, y) -> x%y;
		System.out.println("remainder: "+li4.cal(3, 2));
		
		li4 = (x, y) -> sum(x, y);
		System.out.println("sum: "+li4.cal(3, 2));
	}
	
	static int sum(int x, int y) {
		return x+y;
	}

}

@FunctionalInterface
interface LambdaInterface4 {
	int cal(int x, int y);
}