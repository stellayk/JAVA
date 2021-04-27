package ch08;

public class SmartphoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p = new Phone();
		p.name="phone";
		p.company="Apple";
		p.color="Grey";
		
		System.out.println("Print phone info");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		Smartphone sp = new Smartphone();
		sp.name = "Galaxy";
		sp.company="Samsung";
		sp.color="Black";
		
		System.out.println("Print smartphone info");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}
