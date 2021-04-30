package ch12.string;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Stella";
		String name2 = "June";
		
		if(name1 == name2) {
			System.out.println("name1 == name2");
		} else {
			System.out.println("name1 != name2");
		}
		
		if(name1.equals(name2)) {
			System.out.println("name1.equals(name2)");
		} else {
			System.out.println("!name1.equals(name2)");
		}
		
		String name3 = new String("Stella");
		String name4 = new String("Stella");
		
		if(name3 == name4) {
			System.out.println("name3 == name4");
		} else {
			System.out.println("name3 != name4");
		}
		
		if(name3.equals(name4)) {
			System.out.println("name3.equals(name4)");
		} else {
			System.out.println("!name3.equals(name4)");
		}
		
	}

}
