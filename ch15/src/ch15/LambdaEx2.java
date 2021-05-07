package ch15;

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		
		Runnable run = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("First: "+i);
			}
		};
		
		Runnable run2 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("Second: "+i);
			}
		};
		
		Thread t = new Thread(run);
		Thread t2 = new Thread(run2);
		
		t.start();
		t2.start();
		System.out.println("end");
	}

}