package MyPracticeSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<String>();
		List<String>find= Arrays.asList("java");
		find.contains("java");
		name.add("java");
		name.add("Programming");
		name.add("Langauge");
		System.out.println(name.get(1));
		System.out.println("**********");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));

		}
		System.out.println("&&&&&&&&&&");
		for (String n : name) {
			System.out.println(n);
		}

	}

}
