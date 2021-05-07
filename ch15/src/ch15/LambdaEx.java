package ch15;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface li = () -> {
			String str = "print method";
			System.out.println(str);
		};
		
		li.print();
	}

}

interface LambdaInterface {
	void print();
}