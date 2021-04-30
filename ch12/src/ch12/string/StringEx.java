package ch12.string;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=90;
		System.out.println("Your score is "+score);
		
		//String s = score; error
		String s = String.valueOf(score);
		
		String s2 = score + "";
	}

}
