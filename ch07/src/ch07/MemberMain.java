package ch07;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m = new Member();
		Member m2 = new Member();
		
		if(m==m2) {
			System.out.println("m=m2");
		}else {
			System.out.println("m!=m2");
		}
	}

}
