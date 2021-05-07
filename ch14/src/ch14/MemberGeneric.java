package ch14;

import java.util.ArrayList;
import java.util.List;

public class MemberGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Member> list = new ArrayList<Member>();
		
		Member mem1 = new Member();
		mem1.setName("Brandon");
		mem1.setId("brandon");
		mem1.setPassword("brandon123");
		mem1.setAge(20);
		list.add(mem1);
		
		Member mem2 = new Member();
		mem2.setName("Joon");
		mem2.setId("joon77");
		mem2.setPassword("joon123");
		mem2.setAge(25);
		list.add(mem2);
		
		Member mem3 = new Member();
		mem3.setName("Kim");
		mem3.setId("kimmmm");
		mem3.setPassword("kim123");
		mem3.setAge(30);
		list.add(mem3);
		
		System.out.println("list.size(): "+list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("Index: "+i
					+", Name: "+((Member) list.get(i)).getName()
					+", ID: "+((Member) list.get(i)).getId()
					+", PW: "+((Member) list.get(i)).getPassword()
					+", Age: "+((Member) list.get(i)).getAge());
		}
	}

}
