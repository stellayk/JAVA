package ch12;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 object is equal to obj2 object");
		} else {
			System.out.println("obj1 object is not equal to obj2 object");
		}
		
		Obj obj3 = obj1;
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 object is equal to obj3 object");
		} else {
			System.out.println("obj1 object is not equal to obj3 object");
		}
		
		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);
		
		if(objo1.equals(objo2)) {
			System.out.println("objo1 object is equal to objo2 object");
		} else {
			System.out.println("objo1 object is not equal to objo2 object");
		}
	}
}

class Obj {
	int obj_var;
	
	Obj(int obj_var) {
		this.obj_var = obj_var;
	}
}

class ObjOverride {
	int obj_var;
	
	ObjOverride(int obj_var) {
		this.obj_var = obj_var;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjOverride) {
			return true;
		} else {
			return false;
		}
	}
}
