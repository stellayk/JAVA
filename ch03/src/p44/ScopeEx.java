package p44;

public class ScopeEx {
	int no;
	
	public static void main(String[] args) {
		String name;
		
		if(true) {
			name = "James Cordon";
			String email = "james@test.com";
		}
		
		//error
		//email = "james@test.com";
	}
}
