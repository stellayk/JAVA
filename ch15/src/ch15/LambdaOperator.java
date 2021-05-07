package ch15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaOperator {
	
	static Student[] list = {
			new Student("Stella Kim", 90, 80, "Music"),
			new Student("Joon Kim", 90, 70, "Statistics"),
			new Student("Sam Lee", 60, 90, "Computer Science")
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Highest math score: ");
		int max = maxOrMinMath((a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("Lowest math score: ");
		System.out.println(maxOrMinMath((a,b) -> (a<=b ? a:b)));

		System.out.print("Highest average score: ");
		System.out.println(maxorMinAvg((a,b) -> (a>=b ? a:b)));
		
		System.out.print("Lowest average score: ");
		System.out.println(maxorMinAvg((a,b) -> (a<=b ? a:b)));
	}

	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	
	private static double maxorMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath()+list[0].getEng())/2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
}
