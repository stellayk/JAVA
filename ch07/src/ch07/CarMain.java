package ch07;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car hummer = new Car();
		Car pride = new Car();
		
		hummer.color="white";
		hummer.company="GM";
		hummer.type="truck";
		
		pride.color="black";
		pride.company="Kia";
		pride.type="SUV";
		
		hummer.go();
		pride.go();
		System.out.println(hummer.color);
		System.out.println(hummer.company);
		System.out.println(hummer.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}
