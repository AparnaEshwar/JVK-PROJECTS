package collectionsclasses;

import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0);
		//list.addFirst(0);
		//for (Integer ll : list) {
			//System.out.println(ll);
		
			list.remove(3);
			//list.removeFirst();
		for (Integer rl : list) {
			System.out.println(rl);

		}
	}

}
