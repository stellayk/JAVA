package ch17;

public class ThreadYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YieldThread t1=new YieldThread();
		YieldThread t2=new YieldThread();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) { }
		t1.isContinue=false;
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) { }
		t1.isContinue=true;
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) { }
		
		t1.isBreak=true;
		t2.isBreak=true;
	}
}

class YieldThread extends Thread {
	boolean isBreak=false;
	boolean isContinue=true;
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) {
				System.out.println(getName()+" performing");
			} else {
				Thread.yield();
			}
		}
		System.out.println(getName()+" ends");
	}
}