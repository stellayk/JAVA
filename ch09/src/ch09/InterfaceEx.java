package ch09;

public interface InterfaceEx {
	public int min_price = 0;
	public int max_price = 100000;
	
	public double meanPrice();
	public double totalPrice();
	
	default double getSalePrice(double price) {
		return price-(price*0.05);
	}
	
	static void printPrice(double price) {
		System.out.println(price);
	}
}
