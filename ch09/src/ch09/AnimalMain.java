package ch09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		
		Eagle eagleObj = (Eagle) eagle;
		eagleObj.eat();
	}
}