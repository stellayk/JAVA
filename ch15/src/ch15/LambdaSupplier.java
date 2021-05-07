package ch15;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s1 = () -> {
			return "Elon Musk";
		};
		System.out.println(s1.get());
		
		s1 = () -> "Jeff Bezos";
		System.out.println(s1.get());
		
		IntSupplier s2 = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		System.out.println("Dice: "+s2.getAsInt());
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("Random: "+s3.getAsDouble());
	}

}
