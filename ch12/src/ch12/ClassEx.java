package ch12;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnvEx env = new EnvEx();
		
		Class c1 = env.getClass();
		System.out.println(c1.getName());
		
		try {
			Class c2 = Class.forName("ch12.PropertyEx");
			System.out.println(c2.getName());
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}

class EnvEx {}