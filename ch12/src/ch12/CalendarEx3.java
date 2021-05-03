package ch12;

import java.util.Date;

public class CalendarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//today
		int sYear = 2021;
		int sMonth = 5;
		int sDay = 3;
		
		//past
		int eYear = 2020;
		int eMonth = 3;
		int eDay = 1;
		
		Date sd = new Date();
		Date ed = new Date();
		
		sd.setYear(sYear);
		sd.setMonth(sMonth-1);
		sd.setDate(sDay);
		
		ed.setYear(eYear);
		ed.setMonth(eMonth-1);
		ed.setDate(eDay);
		
		long temp = (sd.getTime()-ed.getTime())/(1000L *60L *60L *24L);
		int diff = (int)temp;
		
		System.out.println(diff +" days passed");
	}

}
