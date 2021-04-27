package p57;

public class IncrementOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		
		++a;
		b++;
	
		System.out.println(a);
		System.out.println(b);
		
		
		int c = 10;
		int d = ++c;
		System.out.println("when the operator comes first: "+d);
		
		int x = 10;
		int y = x++;
		System.out.println("when the operator comes last: "+y);
		System.out.println("x:"+x);
	}

}
