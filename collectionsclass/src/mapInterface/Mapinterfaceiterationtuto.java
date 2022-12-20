package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class Mapinterfaceiterationtuto {
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("Name", "Aparna");
		data.put("Subject", "Java Program");
		data.put("Name", "Venkatesh");
		data.put("Subject", "Networking");
		for (String string : data.keySet()) {
			System.out.println(string);

		}
		System.out.println();
		for (String string : data.values()) {
			System.out.println(string);

		}

	}

}
