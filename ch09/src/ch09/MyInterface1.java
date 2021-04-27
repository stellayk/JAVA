package ch09;

public interface MyInterface1 {
	default void defaultMethod() {
		System.out.println("default method of MyInterface1");
	}
	
	static void staticMethod() {
		System.out.println("static method of MyInterface1");
	}
}
