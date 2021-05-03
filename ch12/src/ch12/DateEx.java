package ch12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss E a");
		System.out.println(sf.format(now));
		
		
		//calendar to date
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		
		//date to calendar
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal.setTime(d);
	}

}
