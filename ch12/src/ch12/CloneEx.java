package ch12;

public class CloneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"A", "B", "C", "D"};
		String[] arr2 = arr.clone();
		
		System.out.println(arr == arr2);
		for(String v:arr2) {
			System.out.println(v);
		}
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		System.out.println(arr == arr3);
		for (String v: arr3) {
			System.out.println(v);
		}
	}

}
