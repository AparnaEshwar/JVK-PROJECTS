package collectionsclasses;

import java.util.ArrayList;

public class CollectionsandInterface {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		for (Integer x : a1) {  //simple way to iterate (for each method)
			System.out.println(x);

		}

	}
	// for (int i = 0; i < a1.size(); i++) { // usual way to iterate

	// System.out.println(a1.get(i));

}
