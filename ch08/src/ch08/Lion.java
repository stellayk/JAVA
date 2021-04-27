package ch08;

public class Lion extends Animal {
	Lion(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name + "is sleeping in the forest.");
	}
}
