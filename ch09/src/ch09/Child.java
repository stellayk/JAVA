package ch09;

public class Child extends Parent implements MyInterface1, MyInterface2 {
	@Override
	public void defaultMethod() {
		System.out.println("default method of Child Class");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
}
