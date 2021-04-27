package ch08;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] ani = new Animal[4];
		
		Animal eagle = new Eagle("bird", "eagle");
		Animal tiger = new Eagle("mammal", "tiger");
		Animal lion = new Eagle("mammal", "lion");
		Animal shark = new Eagle("fish", "shark");
		
		ani[0]=eagle;
		ani[1]=tiger;
		ani[2]=lion;
		ani[3]=shark;
		
		for(int i=0; i<ani.length; i++) {
			ani[i].sleep();
		}
	}

}
