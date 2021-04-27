package ch09;

public interface MyInterface2 {
	default void defaultMethod() {
		System.out.println("default method of MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("static method of MyInterface2");
	}
}
