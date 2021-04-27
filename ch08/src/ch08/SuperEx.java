package ch08;

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		child.print();
	}

}

class Parent{
	int number = 3;
	Parent() {
		System.out.println("Object parent");
	}
}

class Child extends Parent {
	int number = 2;
	
	Child(){
		System.out.println("Object child");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
