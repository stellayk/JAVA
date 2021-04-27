package p128;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"George", "Sally", "Tim"};
		int[] scores = {90,80,100};	
		
		int i=0;
		for(String name : names) {
			System.out.println(name+": "+scores[i]);
			i++;
		}
	}

}
