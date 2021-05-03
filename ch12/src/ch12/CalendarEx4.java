package ch12;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx4 {

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
		
		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
		sCal.set(sYear, sMonth+1, sDay);
		eCal.set(eYear, eMonth+1, eDay);
		
		long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis())/1000;
		long diffDay = diffSec / (24*60*60);
		
		System.out.println(diffDay +" days passed");
	}

}
