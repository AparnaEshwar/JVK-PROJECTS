package collectionsclasses;

import java.util.HashSet;

public class SetInCollections {
	public static void main(String[] args) {
		HashSet<Integer> as = new HashSet<>();
		as.add(10);
		as.add(20);
		as.add(10);// duplicate value
		as.add(30);
		as.add(40);
		for (Integer y : as) {
			System.out.println(y);
			
		}
		
		
	}

}
