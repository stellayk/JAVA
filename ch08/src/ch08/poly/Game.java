package ch08.poly;

public class Game {
	void display(GraphicCard gc) {
		gc.process();
	}
	
	void display(Amd gc) {
		gc.process();
	}
	
	void display(Nvidia gc) {
		gc.process();
	}
}
