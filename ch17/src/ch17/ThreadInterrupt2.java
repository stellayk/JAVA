package ch17;

public class ThreadInterrupt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("t1 thread starts");
				
				int i=1;
				while(true) {
					System.out.println("t1: "+i);
					i++;
					if(Thread.interrupted()) {
						break;
					}
				}
				System.out.println("t1 thread ends");
			}
		});
		
		t1.start();
		
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {}
		t1.interrupt();
	}

}
