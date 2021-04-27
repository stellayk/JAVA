package ch07;

public class CarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array
		Car[] cars = new Car[3];
		
		//object
		Car tico = new Car();
		tico.color="white";
		tico.company="Hyundai";
		tico.type="sedan";
		
		//save the object into every index
		for(int i=0; i<cars.length; i++) {
			cars[i]=tico;
		}
		
		System.out.println("color of 2nd index: "+cars[2].color);
		
		//replace the color filed of 0 index
		cars[0].color="black";
		
		System.out.println("color of 2nd index: "+cars[2].color);
	}

}
