package ch08.poly;

public class PolyEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.run();
		
		Child c = (Child)p;
		c.eat();
	}

}
