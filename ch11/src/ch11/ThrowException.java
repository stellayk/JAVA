package ch11;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start the program");
		try {
			throw new Exception("Exception");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End the program");
	}

}
