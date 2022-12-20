package Condition_String;

import java.util.Arrays;

public class strngtoarry {
	public static void main(String[] args) {
		String star[] = new String[6];
		star[0] = "A";
		star[1] = "B";
		star[2] = "C";
		star[3] = "D";
		
		System.out.println("serial alphabets:" + Arrays.toString(star));
		int numberofitems = 4;
		String newitem1 = "E";
		String newitem2 = "F";

		star[numberofitems++] = newitem1;
		star[numberofitems++] = newitem2;
		System.out.println("after additing the elements:"+ Arrays.toString(star));
		Arrays.toString(star);

	}

}
