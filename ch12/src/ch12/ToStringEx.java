package ch12;

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit f = new Fruit("apple", "red");
		System.out.print(f);
	}

}

class Fruit {
	String name;
	String color;
	
	public Fruit(String name, String color) {
		this.name=name;
		this.color=color;
	}
}
