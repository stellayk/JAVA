package ch13.SetInterface;

public class Member2 implements Comparable {
	//field
	String name;
	int age;
	
	//constructor
	Member2 (String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//redefine toString() method 
	@Override
	public String toString() {
		return "("+name+","+age+")";
	}
	
	@Override
	public int compareTo(Object o) {
		Member2 m = (Member2) o;
		return this.name.compareTo(m.name);
	}
	
}
