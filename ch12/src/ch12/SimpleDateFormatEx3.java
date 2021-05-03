package ch12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String strDate = "05-03-2021";
		
		Date d = null;
		
		try {
			d = sdf.parse(strDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(d);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy E");
		System.out.println(sdf2.format(d));
	}

}
