package ch12;

public class ToStringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit2 f = new Fruit2("apple", "red");
		System.out.print(f);
	}

}

class Fruit2 {
	String name;
	String color;
	
	public Fruit2(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Fruit name: "+this.name+"\nFruit color: "+this.color;
	}
}
