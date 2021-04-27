package p87;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 3;
		
		switch(number) {
			case 1:
				System.out.println("1");
				break;
		
			case 2:
				System.out.println("2");
				break;
				
			case 3:
				System.out.println("3");
				break;
		
			case 4:
				System.out.println("4");
				break;
		
			case 5:
				System.out.println("5");
				break;
		
			default :
				System.out.println("6");
		}
		
		System.out.println("Enter your score.");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		switch(score/10) {
			case 9:
				grade="A";
				break;
			case 8:
				grade="B";
				break;
			case 7:
				grade="C";
				break;
			case 6:
				grade="D";
				break;
			default:
				grade="F";
		}
		System.out.println("Grade: "+grade);
	}

}
