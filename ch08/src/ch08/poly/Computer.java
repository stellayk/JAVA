package ch08.poly;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphicCard gc = new GraphicCard();
		gc.process();
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}

}
