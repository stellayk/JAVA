package ch16;

public class Circle extends Shape {
	//field
	double r;
	
	//constrcutor
	Circle() {
		this (1);
	}
	
	Circle(double r){
		this.r=r;
	}
	
	//overriding
	@Override
	double area() {
		return (r*r)*Math.PI;
	}
	
	@Override
	double length() {
		return (r*2)*Math.PI;
	}
	
	@Override
	public String toString() {
		return "area: "+this.area();
	}
}
