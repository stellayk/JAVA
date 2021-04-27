package ch09;

public class Complexer implements Printer, Scanner, Fax {
	@Override
	public void send(String tel) {
		System.out.println("Send fax to " + tel + " from " + FAX_NUMBER);
	}
	
	@Override
	public void receive(String tel) {
		System.out.println("Receive fax to " + FAX_NUMBER + " from " + tel);
	}
	
	@Override
	public void scan() {
		System.out.println("Scan");
	}
	
	@Override
	public void print() {
		System.out.println("Print");
	}
}
