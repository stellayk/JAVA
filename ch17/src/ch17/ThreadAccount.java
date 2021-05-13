package ch17;

public class ThreadAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		
		Mother mother = new Mother(acc);
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000 );
		} catch(InterruptedException e) {}
		
		son.interrupt();
		mother.interrupt();
	}

}

class Account {
	int money;
	
	synchronized void withdraw() {
		while (money == 0) {
			try {
				wait();
			} catch(InterruptedException e) {
				break;
			}
		}
		
		notifyAll();
		System.out.println(Thread.currentThread().getName() + money + " Dollar Withdrawn");
		money = 0;
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			} catch(InterruptedException e) {
				break;
			}
			
			//deposit random 
			money = (int)((Math.random()*50)+1)*10000;
			notifyAll();
			System.out.println();
			System.out.println(Thread.currentThread().getName() + money + " Dollar Deposit");
		}
	}	
}

class Mother extends Thread {
	Account account;
	
	Mother(Account account){
		super("Mom");
		this.account=account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.deposit();
				sleep((int)(Math.random()*2000));
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}

class Son extends Thread {
	Account account;
	
	Son(Account account){
		super("Son");
		this.account=account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.withdraw();
				sleep((int)(Math.random()*300));
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}