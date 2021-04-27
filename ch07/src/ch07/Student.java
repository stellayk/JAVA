package ch07;

public class Student {
	//field
	String name;
	int grade;
	String department;
	
	//constructor #1
	Student(){
		
	}
	
	//constructor #2
	Student(String n){
		name=n;
	}
	
	//constructor #3
	Student(String n, int g){
		name=n;
		grade=g;
	}
	
	//constructor #4
	Student(String n, int g, String d){
		name=n;
		grade=g;
		department=d;
	}
}
