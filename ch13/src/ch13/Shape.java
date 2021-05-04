package ch13;

abstract class Shape {
	//field
	int x, y;
	
	//constructor
	Shape() {
		this(0, 0);
	}
	
	Shape (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//abstract method
	abstract double area();
	abstract double length();
	
	//general method
	public String getLocation() {
		return "x: "+x+", y: "+y;
	}
}
