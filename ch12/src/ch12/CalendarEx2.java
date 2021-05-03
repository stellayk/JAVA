package ch12;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		
		System.out.println("AM(0)/PM(1): "+ today.get(Calendar.AM_PM));
		System.out.println("Hour: "+ today.get(Calendar.HOUR));
		System.out.println("Hour: "+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: "+ today.get(Calendar.MINUTE));
		System.out.println("Second: "+ today.get(Calendar.SECOND));
		System.out.println("Millisecond: "+ today.get(Calendar.MILLISECOND));
		System.out.println("Timezone: "+ today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println("Last day of this month: "+ today.getActualMaximum(Calendar.DATE));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2021, (5-1), 3);
		System.out.println("Date: " + (cal.get(Calendar.MONTH) + 1) + "/" +
									  cal.get(Calendar.DATE) + "/" +
									  cal.get(Calendar.YEAR));

	}
}