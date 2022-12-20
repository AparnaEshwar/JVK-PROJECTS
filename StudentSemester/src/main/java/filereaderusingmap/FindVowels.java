package filereaderusingmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindVowels {
	public static Map<Character, Integer> countingvowelsinsentnce(String name) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);

		char[] array = name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], count + 1);

			}

		}
		return map;

	}

	public static void main(String[] args) {
		Map<Character, Integer> vowels = countingvowelsinsentnce("object oriented language");
		for (Entry<Character, Integer> string : vowels.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());

		}

	}

}
