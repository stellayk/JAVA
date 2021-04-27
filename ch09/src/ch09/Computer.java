package ch09;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphicCard gc = new Amd();
		System.out.println("Memory: "+gc.MEMORY);
		
		//Amd
		gc = new Amd();
		gc.process();
		
		//Replace to Nvidia
		gc = new Nvidia();
		gc.process();
	}

}
