package ch17;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inherit thread
		ThreadExtend t1 = new ThreadExtend();
		
		//runnable
		Runnable r = new RunnableImple();
		
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}

class ThreadExtend extends Thread{
	public void run() {
		System.out.println("Inherit Thread");
		for(int i=0; i<50; i++) {
			System.out.println("ThreadExtend: "+i);
		}
	}
}

class RunnableImple implements Runnable{
	public void run() {
		System.out.println("Runnable");
		for(int i=0; i<50; i++) {
			System.out.println("RunnableImple: "+i);
		}
	}
}

