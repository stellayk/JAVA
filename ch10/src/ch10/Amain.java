package ch10;

public class Amain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		
		//static member class objects
		A.B b = new A.B();
		b.var1=3;
		b.method1();
		A.B.var2=3;
		A.B.method2();
		
		//instance inner class objects
		A.C c = a.new C();
		c.var1=3;
		c.method1();
		
		a.method();
	}

}
