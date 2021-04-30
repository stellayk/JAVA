package ch11;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			first();
		} catch(Exception e) {
			System.out.println("main() exception");
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception {
		try {
			second();
		} catch(Exception e) {
			System.out.println("first() exception");
			throw e;
		}
	}

	static void second() throws Exception {
		try {
			throw new Exception("exception");
		} catch(Exception e) {
			System.out.println("second() exception");
			throw e;
		}
	}
}
