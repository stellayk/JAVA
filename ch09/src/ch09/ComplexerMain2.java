package ch09;

public class ComplexerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fax fax = new Fax() {
			@Override
			public void send(String tel) {
				System.out.println("abstract send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("abstract receive()");
			}
		};
		
		fax.send("1234");
		fax.receive("5678");
	}

}
