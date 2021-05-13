package ch17;

public class DaemonThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		
		dt1.setDaemon(true);
		dt2.setDaemon(true);
		
		dt1.start();
		dt2.start();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
	}

}

class DaemonThread extends Thread{
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch(InterruptedException e) {}
		}
	}
}