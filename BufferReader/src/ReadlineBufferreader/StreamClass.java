package ReadlineBufferreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class StreamClass {
	public static void main(String args[])throws IOException {
		String fileName = "D:\\test.txt";
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String line;
		while((line = br.readLine()) != null){
		    
		     System.out.println(line);
		}
		br.close();
			
	}

	
}
