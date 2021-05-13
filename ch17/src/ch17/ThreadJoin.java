package ch17;

public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum t1=new Sum();
		Sum t2=new Sum();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			
		}
		System.out.println("Sum of threads: "+(t1.sum+t2.sum));
	}
}


class Sum extends Thread {
	int sum = 0;
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}
}