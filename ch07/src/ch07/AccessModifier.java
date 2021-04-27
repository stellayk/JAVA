package ch07;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca = new ClassA();
		ca.print();
	}
	public void print() {
		System.out.println("class AccessModifier");
	}

}

class ClassA{
	void print() {
		System.out.println("class A");
	}
}
