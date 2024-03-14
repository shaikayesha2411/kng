package kng;

import java.util.HashSet;
import java.util.Iterator;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hl=new HashSet<Integer>();
		hl.add(89);
		hl.add(7);
		hl.add(8);
		System.out.println(hl);
		Iterator it =hl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
		
		}
}