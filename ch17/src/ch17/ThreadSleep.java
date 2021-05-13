package ch17;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("t1 thread starts");
				for(int i=0; i<10; i++) {
					System.out.println("t1: "+i);
					
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {}
				}
				System.out.println("t1 thread ends");
			}
		});
		
		t1.start();
	}

}
