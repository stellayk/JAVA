package ch07;

public class ReturnEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return2 obj = new Return2();
		
		obj.getTest(0);
		obj.getTest(1);

		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));

	}

}

class Return2{
	void getTest(int type) {
		System.out.println("getTest() method starts");
		
		if(type==1) {
			return;
		}
		System.out.println("getTest() method ends");
	}
	
	String getName(int type) {
		if(type==1) {
			return "";
		}
		return "George";
	}
}
