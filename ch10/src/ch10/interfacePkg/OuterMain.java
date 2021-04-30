package ch10.interfacePkg;

public class OuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer out = new Outer();
		
		out.setInterfaceEx(new InterfaceExImple());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExImple2());
		out.outerMethod();
	}

}
