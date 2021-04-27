package p85;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = 90;
		int eng = 95;
		
		if(math>=60 && eng>=60) {
			System.out.println("Pass");
		/*
		if(math>=60) {
			if(eng>=60) {
				System.out.println("Pass");
			}
		*/
		}else {
			System.out.println("Fail");
		}
	}

}
