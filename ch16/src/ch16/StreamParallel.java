package ch16;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		//stream()
		long start = System.nanoTime();
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		long end = System.nanoTime();
		System.out.println("stream() performing time: "+(end-start)+" nano sec");
		
		//parallelStream()
		start = System.nanoTime();
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		end = System.nanoTime();
		System.out.println("parallelStream() performing time: "+(end-start)+" nano sec");
	}

}
