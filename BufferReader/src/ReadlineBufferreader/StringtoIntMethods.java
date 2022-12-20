package ReadlineBufferreader;

import java.io.BufferedReader;

import java.io.FileReader;

import javax.imageio.IIOException;

public class StringtoIntMethods {
	public static String changeStringtoIneger(String name, String findname) throws Throwable {
		FileReader file = new FileReader(name);
		BufferedReader br = new BufferedReader(file);
		String line;
		
		int count = 0;
		while ((line = br.readLine()) != null) {
			String[] array = line.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(findname)) {
					count++;
				}
			}
		}

		file.close();
		br.close();
		String sop = Integer.toString(count);
		return sop;
	}

	public static void main(String[] args) throws Throwable {
		String result = changeStringtoIneger("D:\\test.txt", "book");
		System.out.println(result);

	}
}
