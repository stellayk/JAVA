package ch07;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class variable
		System.out.println("Hummer's manufacture: "+Hummer.company);
		
		Hummer h1 = new Hummer();
		Hummer h2 = new Hummer();
		
		//change values of instance variables
		h1.color="white";
		h2.color="black";
		
		//print instance variables
		System.out.println("color of h1: "+h1.color);
		System.out.println("color of h2: "+h2.color);
		
		//print class variables
		System.out.println("manufacture of Hummer: "+Hummer.company);
		System.out.println("manufacture of h1: "+h1.company);
		System.out.println("manufacture of h2: "+h2.company);
	}

}

class Hummer{
	String color; //instance variable
	static String company = "GM"; //class variable
}
