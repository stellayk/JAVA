package ch15;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaFunction {
	
	static Student[] list = {
			new Student("Stella Kim", 90, 80, "Music"),
			new Student("Joon Kim", 90, 70, "Statistics")
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Name: ");
		printString(t -> t.getName());
		
		System.out.print("Major: ");
		printString(t -> t.getMajor());
		
		System.out.print("English: ");
		printInt(t -> t.getEng());
		
		System.out.print("Math: ");
		printInt(t -> t.getMath());
		
		System.out.print("English total: ");
		printTot(t -> t.getEng());
		
		System.out.print("Math total: ");
		printTot(t -> t.getMath());
		
		System.out.print("English average: ");
		printAvg(t -> t.getEng());
		
		System.out.print("Math average: ");
		printAvg(t -> t.getMath());

	}
	
	static void printAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum/list.length);
	}
	
	static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	static void printInt(Function<Student, Integer> f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
		}
		System.out.println();
	}
	
	static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
		}
		System.out.println();
	}
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}