package collectionsclasses;

import java.util.ArrayList;

public class ArryalistinString {
	public static void main(String[] args) {
		ArrayList<String> arl= new ArrayList<String>();
		arl.add("please");
		arl.add("refer");
		arl.add("the");
		arl.add("below");
		arl.add("code");
		arl.add("To Practice");
		for (String str : arl) {
			System.out.println(str);
			}
		arl.remove("code");
		for (String str : arl) {
			System.out.println(str);
			
		}
		
	}

}
