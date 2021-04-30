package ch10;

//outer class
class A {
	A(){
		System.out.println("A");
	}
	
	//static inner class
	static class B {
		B(){
			System.out.println("B");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("method1() of static inner class");
		}
		
		static void method2() {
			System.out.println("static method2() of static inner class");
		}
	}
	
	//instance inner class
	public class C {
		C(){
			System.out.println("C");
		}
		
		int var1;
	
		void method1() {
			System.out.println("method1() of instance inner class");
		}
	}
	
	//outer class method
	void method() {
		//local inner class
		class D {
			D() {
				System.out.println("D");
			}
			
			int var1;
			
			void method1() {
				System.out.println("method1() of local inner class");
			}
		}
		
		D d = new D();
		d.var1=3;
		d.method1();
	}
}
