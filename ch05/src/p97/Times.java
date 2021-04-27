package p97;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("times table");
		
		for(int j=2; j<10; j++) {
			System.out.println("["+j+" times]");
			
			for(int i=1; i<10; i++) {
				System.out.println(j + "*" + i + " = " + j*i);
			}
		}
	}

}
