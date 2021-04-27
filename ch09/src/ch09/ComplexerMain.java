package ch09;

public class ComplexerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("111-111-1111");
		com.receive("222-222-2222");
	}

}
