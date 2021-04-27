package ch09;

public class UserClass {
	@UserAnnot (value="A")
	public void methodA() {
		System.out.println("methodA()");
	}
	
	@UserAnnot (value="B", number=10)
	public void methodB() {
		System.out.println("methodB()");
	}
}
