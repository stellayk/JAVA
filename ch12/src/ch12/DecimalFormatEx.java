package ch12;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df1 = new DecimalFormat("###,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		
		System.out.println(df1.format(5500));
		System.out.println(df2.format(5500));
	}

}
