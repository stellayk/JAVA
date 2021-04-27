package ch07;

public class InitEx {

	//constructor
	InitEx(){
		System.out.println("Call a constructor");
	}
	
	//static block
	static {
		System.out.println("Run a class init block");
	}
	
	//instance init block
	{
		System.out.println("Run an instance init block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start the main method");
		System.out.println("main init1 object");
		InitEx init1 = new InitEx();
		System.out.println("main init2 object");
		InitEx init2 = new InitEx();
	}

}
