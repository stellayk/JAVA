package ch07;

public class Car2 {
	//field
	String color;
	String company;
	String type;
	
	Car2(){
		this("white", "GM", "truck");
	}
	
	Car2(String color, String company, String type){
		this.color=color;
		this.company=company;
		this.type=type;
	}
	
	Car2(String com, String t){
		this("white", com, t);
	}
	
	Car2(String t){
		this("white", "GM", t);
	}
	
	public String toString() {
		return color+"-"+company+"-"+type;
	}
}
