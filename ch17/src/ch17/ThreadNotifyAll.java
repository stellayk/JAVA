package ch17;

public class ThreadNotifyAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhoneGame2 game = new SmartPhoneGame2();
		
		Player3 p1 = new Player3();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		Player4 p2 = new Player4();
		p2.setSmartPhoneGame(game);
		p2.start();
	}

}

class SmartPhoneGame2 {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
	public synchronized void increaseLevel() {
		while(true) {
			this.level++;
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			//print thread name and level
			System.out.println(Thread.currentThread().getName()+" Level: "+this.level);
			
			//notifyAll(), wait()
			if(this.level == 5) {
				notifyAll();
				try {
					wait();
				} catch(InterruptedException e) {}
				break;
			}
			
			//exit
			if(this.level%10 == 0) break;
		}
	}
}

class Player3 extends Thread {
	private SmartPhoneGame2 game;
	
	public void setSmartPhoneGame (SmartPhoneGame2 game) {
		this.setName("Player1");
		this.game=game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}

class Player4 extends Thread {
	private SmartPhoneGame2 game;
	
	public void setSmartPhoneGame (SmartPhoneGame2 game) {
		this.setName("Player2");
		this.game=game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}