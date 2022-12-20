package ForLoop;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferandFileReader {
	public static String conversiontoint(String name,String findame)throws Throwable{
		FileReader fr= new FileReader(name);
		BufferedReader br= new BufferedReader(fr);
		String line;
		
		int count=0;
		while((line=br.readLine())!= null) {
			String array[]=line.split(" ");
			for (int i = 0; i < array.length; i++) {
				if(array[i].equalsIgnoreCase(findame)) {
					count++;
				}
				
				
			}
			fr.close();
			br.close();
			String sop=Integer.toString(count);
			return sop;
		}
		
	}
	

}
