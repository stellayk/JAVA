package ch09;

public class ComplexerMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexerInterface ci = new ComplexerInterface() {
			
			@Override
			public void send(String tel) {
				System.out.println("abstract send()");
				
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("abstract receive()");
				
			}
			
			@Override
			public void scan() {
				System.out.println("abstract scan()");
				
			}
			
			@Override
			public void print() {
				System.out.println("abstract print()");
			}
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
	}

}
