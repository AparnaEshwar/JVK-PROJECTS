package ReadlineBufferreader;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.text.ChangedCharSetException;

public class StringToIntExample {
	public static String convertionfromString(String name, String Findname)throws Throwable {
		FileReader Fr= new FileReader(name);
		BufferedReader Br= new BufferedReader(Fr);
		String line;
		
		int count=0;
		while((line=Br.readLine())!=null) {
			String[] array= line.split(" ");
			for(int i=0;i<array.length; i++) {
				if(array[i].equalsIgnoreCase(Findname))
					count++;		
				}
				
			}
	Fr.close();
	Br.close();
	String sop=Integer.toString(count);
	return sop;

}

	public static void main(String args[]) throws Throwable {
		String Output = convertionfromString("D:\\test.txt", "book");
		System.out.println(Output);

	}
}
