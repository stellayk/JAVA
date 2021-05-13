package ch17;

public class ThreadGroupEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup group = new ThreadGroup("Group1");
		MyThread t1 = new MyThread(group, "first");
		MyThread t2 = new MyThread(group, "second");
		MyThread t3 = new MyThread(group, "third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {}
		
		group.interrupt();
	}

}

class MyThread extends Thread {
	MyThread(ThreadGroup group, String name){
		super(group, name);
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch(InterruptedException e) {
				System.out.println(getName()+" interrupted");
				break;
			}
		}
		System.out.println(getName()+" ends");
	}
}