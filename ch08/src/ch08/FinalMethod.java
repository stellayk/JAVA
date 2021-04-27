package ch08;

public class FinalMethod {
	void method() {
		
	}
	
	final void finalMethod() {
		
	}
}

class SubFinalMethod extends FinalMethod {
	void method() {
		System.out.println("method()");
	}
	
	/*error
	void finalMethod() {
		System.out.println("finalMethod()");
	}
	*/
}