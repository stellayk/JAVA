package ch12.stringbuffer;

public class StringBufferEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<100000; i++) {
			sb.append(i);
		}
		
		//end
		long end = System.currentTimeMillis();
		System.out.println("Running time: "+(end-start)/1000);
	}

}
