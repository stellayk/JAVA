package ch08;

public class Eagle extends Animal {
	Eagle(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name + "is sleeping in the sky.");
	}
}
