package ch07;

public class InitEx2 {

	//static variable
	static int sVar;
	//static method
	static void sMethod() {}
	
	//instance variable;
	int var;
	//instance method
	void method() {}
	
	//static init block
	static {
		sVar=0;
		sMethod();
	}
	
	//static method
	static void sMethod2() {}
}
