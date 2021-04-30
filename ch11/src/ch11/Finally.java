package ch11;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DB connection");
		try {
			System.out.println("connecting to DB");
			System.out.println(3/0);
		} catch(Exception e) {
			System.out.println("exception");
		} finally {
			System.out.println("exit");
		}
	}

}
