package collectionsclasses;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer>ts= new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(10);
		ts.add(40);
		ts.add(60);
		for (Integer a : ts) {
			System.out.println(a);
			
		}
		
		
	}

}
