package p100;

public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					break;
				}
				System.out.println("i="+i+", j="+j);
			}
		}
	}

}
