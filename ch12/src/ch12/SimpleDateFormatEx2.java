package ch12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		cal.set(4, 3, 2021);		
		
		Date now = cal.getTime();	
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		sdf2 = new SimpleDateFormat("MM-dd-yyyy E");
		sdf3 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss a");
		
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
	}

}
