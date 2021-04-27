package ch09;

public class InstanceofEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new AAA();
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();
		
		System.out.println("a>A : "+(a instanceof A));
		System.out.println("aa>A : "+(aa instanceof A));
		System.out.println("aaa>A : "+(aaa instanceof A));
		System.out.println("aaa>AB : "+(aaa instanceof AB));
	}

}
