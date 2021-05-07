package ch15;

public class LambdaThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o = new Outer();
		o.method();
	}
}

@FunctionalInterface
interface LambdaInterface5 {
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv=40;
		LambdaInterface5 f5 = () -> {
			System.out.println(Outer.this.iv);
			System.out.println(this.iv);
			System.out.println(iv);
		};
		f5.method();
	}
}