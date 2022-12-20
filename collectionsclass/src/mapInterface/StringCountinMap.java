package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCountinMap {
	public static Map<Character,Integer> findingStingValue(String name){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] array = name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			
				if (map.containsKey(array[i])) {
					int value=map.get(array[i]);
					map.put(array[i], value+1);
				}
				else {
					map.put(array[i], 1);
				}

				}
		return map;

	}

	public static void main(String[] args) {
		Map<Character,Integer> map1 = findingStingValue("SELENIUM");
		for(Entry<Character, Integer> word: map1.entrySet()) {
			System.out.println(word.getKey() + " "+ word.getValue());
				
		}
		
		
	}
}
