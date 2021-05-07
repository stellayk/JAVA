package ch15;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class LambdaConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1 = name -> 
			System.out.println("My name is "+name);
		c1.accept("Joon");
		
		BiConsumer<String, String> c2 = (firstname, lastname) -> 
			{System.out.println("My name is "+firstname+lastname);};
		c2.accept("Joon", "Kim");
		
		DoubleConsumer c3 = (score) ->
			System.out.println("My score is "+score);
		c3.accept(95.5);
		
		ObjIntConsumer<String> c4 = (lecture, i) ->
			{System.out.println("My "+lecture+"score is "+i);};
		c4.accept("English", 100);
	}

}
