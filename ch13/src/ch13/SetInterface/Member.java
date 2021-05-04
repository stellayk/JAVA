package ch13.SetInterface;

public class Member {
	//field
	String name;
	int age;
	
	//constructor
	Member (String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//redefine toString() method 
	@Override
	public String toString() {
		return "("+name+","+age+")";
	}
	
	//redefine equals() method
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	//redefine hashCode() method
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
}
