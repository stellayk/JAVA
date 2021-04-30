package ch11;

import java.util.Scanner;

public class Login {
	
	static String user_id = "sk";
	static String user_pw = "1234";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("ID: ");
			String input_id = scan.nextLine();
			System.out.print("Password: ");
			String input_pw = scan.nextLine();
			
			if(!user_id.equals(input_id)) {
				throw new LoginException("Incorrect ID");
			} else if(!user_pw.equals(input_pw)) {
				throw new LoginException("Incorrect Password");
			} else {
				System.out.println("Login Success!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
