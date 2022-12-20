package filereaderusingmap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FilereaderUsingMap {
	public static Map<String, Integer> filereaderusinghasmap(String file) throws IOException {
		Map<String, Integer> textreader = new HashMap<String, Integer>();
		FileInputStream fir = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fir);
		BufferedReader br = new BufferedReader(isr);

		String line;
		while ((line = br.readLine()) != null) {
			String array[] = line.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (textreader.containsKey(array[i])) {
					int temp = textreader.get(array[i]);
					textreader.put(array[i], temp + 1);
				} else {
					textreader.put(array[i], 1);
				}

			}
		}
		return textreader;
	}

	public static void main(String[] args) {
		Map<String, Integer> readfile = null;
		try {
			readfile = filereaderusinghasmap("D:\\test.txt");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for (Entry<String, Integer> string : readfile.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());

		}
	}

}
