package ch14;

public class GenericEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic<String> gen = new Generic<String>();
		String[] ss = {"June", "July", "August"};
		
		gen.set(ss);
		gen.print();
		
		for(String s : gen.get()) {
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();
		
		for(Integer o : gen2.get()) {
			System.out.println(o);
		}
	}
}

class Generic<T> {
	T[] v;
	
	void set(T[] n) {
		v=n;
	}
	
	T[] get() {
		return v;
	}
	
	void print() {
		for(T o:v) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
}