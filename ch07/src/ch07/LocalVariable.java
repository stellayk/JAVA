package ch07;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local local = new Local();
		
		System.out.println(local.name); //null
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i=0; i<10; i++) {
			int temp=0;
			temp += i;
		}
		
	}

}

class Local{
	String name;
	
	void process() {
		name="Tim";
	}
	void printAge1() {
		int age=20;
		System.out.println(age);
	}
	void printAge2() {
		int age=30;
		System.out.println(age);
	}
}
