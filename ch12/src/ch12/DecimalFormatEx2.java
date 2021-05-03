package ch12;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] scores = {90.555, 80.6666, 70.7777, 60.666666, 50.5};
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(df.format(scores[i]));
		}

	}

}
