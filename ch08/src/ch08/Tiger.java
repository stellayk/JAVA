package ch08;

public class Tiger extends Animal {
	Tiger(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name + "is sleeping in the mountain.");
	}
}
