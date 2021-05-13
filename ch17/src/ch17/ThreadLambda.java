package ch17;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() ->  {
			System.out.println("t1 thread start");
			for(int i=0; i<50; i++) {
				System.out.println("t1: "+i);
			}
		});
		
		Thread t2 = new Thread(() ->  {
			System.out.println("t2 thread start");
			for(int i=0; i<50; i++) {
				System.out.println("t2: "+i);
			}
		});

		t1.start();
		t2.start();
	}

}