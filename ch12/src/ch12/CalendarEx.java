package ch12;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		
		System.out.println("Year: "+today.get(Calendar.YEAR));
		System.out.println("Month: "+ (today.get(Calendar.MONTH)+1));
		System.out.println("Week of Year: "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month: "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Date: "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("Date: "+today.get(Calendar.DATE));
		System.out.println("Day of Year: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("Day of Week: "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of Week in Month: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

}
