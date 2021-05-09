package ch16;

abstract class Shape implements Comparable<Shape>{
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
	
	@Override
	public int compareTo(Shape s) {
		return (int)(this.area()-s.area());
	}
}
