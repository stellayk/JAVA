package ch07;

public class Singleton {
	//static variable
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("make an object");
	}
	
	//static method
	public static Singleton getInstance() {
		System.out.println("return the object");
		return instance;
	}
}
