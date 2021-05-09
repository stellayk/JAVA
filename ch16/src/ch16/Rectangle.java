package ch16;

public class Rectangle extends Shape {
	//field
	int w, h;
	
	//constructor
	Rectangle() {
		this (1,1);
	}
	
	Rectangle(int w, int h) {
		this.w=w;
		this.h=h;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (w*h);
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (w+h)*2;
	}
	
	@Override
	public String toString() {
		return "area: "+this.area();
	}
}
