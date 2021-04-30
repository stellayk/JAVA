package ch12;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boxing(change integer 10 to integer class)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println("i1==i2: "+(i1==i2));
		System.out.println("i1.equals(i2): "+(i1.equals(i2)));
		System.out.println("i1.toString(): "+i1.toString());
		
		//unboxing(change i1 object to integer 10)
		System.out.println("i1==10: "+(i1==10));
		int i3=10;
		System.out.println("i1==i3: "+(i1==i3));
	}

}
