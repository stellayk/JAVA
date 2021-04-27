package ch08;

public class Shark extends Animal {
	Shark(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name + "is sleeping in the water.");
	}
}
