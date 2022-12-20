package Condition_String;

import java.util.Scanner;

public class namecountinarray {
	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the array length");
		int length = sc.nextInt();
		String arr[] = new String[length];
		for (int i = 0; i < arr.length; i++) {
			Scanner scan = new Scanner(System.in);	
			System.out.println("please enter the name");
			String name = scan.nextLine();
			arr[i] = name;
		}
		System.out.println("please enter the find name");
		Scanner scanner = new Scanner(System.in);
		String findname = scanner.nextLine();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(findname)) {
				count++;
			}

		}
	System.out.println(count);
	}
	
}