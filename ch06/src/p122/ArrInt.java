package p122;

public class ArrInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		//insert values
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}
		
		//print values
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					System.out.print(arrInt[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
	}

}
