package ch15;

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface3 li3 = (String name) -> {
			System.out.println("My name is "+name);
		};
		
		li3.print("Joon");
	}

}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name);
}