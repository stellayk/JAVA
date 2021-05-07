package ch15;

import java.util.function.Predicate;

public class LambdaPredicate {
	
	static Student[] list = {
			new Student("Stella Kim", 90, 80, "Music"),
			new Student("Joon Kim", 90, 70, "Statistics"),
			new Student("Sam Lee", 60, 90, "Computer Science")
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double avg = avgEng(t -> t.getMajor().equals("Computer Science"));
		System.out.println("Average English score of computer science: "+avg);

		double avg2 = avgMath(t -> t.getMajor().equals("Computer Science"));
		System.out.println("Average Math score of computer science: "+avg2);
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student:list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student:list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getMath();
			}
		}
		return (double)sum/count;
	}
}
