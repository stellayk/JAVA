package ch08.poly;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("Hello");
	}
	
	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}

}
