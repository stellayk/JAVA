package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss E a");
		System.out.println(sf.format(now));
	}

}
