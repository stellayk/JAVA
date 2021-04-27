package ch07;

public class ParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Param p = new Param();
		p.add(10, 5);
		p.add2(10, 5);
		p.add((int)10.5, (int)5.5);
	}

}

class Param{
	void add(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x+y;
		System.out.println(z);
	}
}
