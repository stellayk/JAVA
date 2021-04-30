package ch12;

public class WrapperEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		Integer intg = (Integer) i;
		//Integer intg = Integer.valueOf(i);
		
		Long lng = 10L; 
		//Long lng = new Long(100L);
		
		int i2 = intg + 10;
		long l = intg + lng;
		System.out.println("i2="+i2);
		System.out.println("l="+l);
		
		Integer intg2 = new Integer(30);
		int i3 = (int) intg2;
		System.out.println("i3="+i3);
	}

}
