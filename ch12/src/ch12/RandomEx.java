package ch12;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println(rand.nextInt(6)+1);
		}
	}

}
