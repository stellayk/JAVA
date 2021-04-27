package ch07;

public class Car2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("Compact SUV");
		Car2 c3 = new Car2("Ford", "Sedan");
		Car2 c4 = new Car2("black","Kia","SUV");
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println("c4="+c4);
	}

}
