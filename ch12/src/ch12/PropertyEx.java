package ch12;

public class PropertyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java version
		System.out.println(System.getProperty("java.version"));
		//JDK path
		System.out.println(System.getProperty("java.home"));
		//OS
		System.out.println(System.getProperty("os.name"));
		//File separator(Linux, Unix = /)
		System.out.println(System.getProperty("file.separator"));
		//username
		System.out.println(System.getProperty("user.name"));
		//user home directory
		System.out.println(System.getProperty("user.home"));
		//current workspace directory
		System.out.println(System.getProperty("user.dir"));
		
		
		for(String var:System.getenv().keySet()) {
			System.out.println(var+"="+System.getenv(var));
		}
	}

}
