package ch14;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoGeneric nogen = new NoGeneric();
		String[] ss = {"June", "July", "August"};
		
		nogen.set(ss);
		nogen.print();
		
		Object[] obj = nogen.get();
		for(Object o : obj) {
			String s = (String) o;
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		
		nogen.set(ii);
		obj = nogen.get();
		
		for(Object o : obj) {
			//String s = (String) o;
			//System.out.println(s);
		}
	}
}

class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v=n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for(Object o:v) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
}