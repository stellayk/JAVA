package ch07;

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method.printName();
		
		Method m = new Method();
		m.printEmail();
	}

}

class Method{
	static void printName() {
		System.out.println("printName()");
	}
	
	void printEmail() {
		System.out.println("printEmail()");
		printId();
	}
	
	void printId() {
		System.out.println("printID()");
	}
}
