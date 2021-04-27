package ch09;

public interface Fax {
	String FAX_NUMBER = "000-000-0000";
	void send(String tel);
	void receive(String tel);
}
