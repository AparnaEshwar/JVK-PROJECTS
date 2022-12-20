package Condition_String;

import java.util.Scanner;

public class switchstmntcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Roll Num");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		switch (input) {
		case "abd":
			System.out.println("Name of the Student is: Aparna");
			break;
		case "efg":
			System.out.println("name of the Student is: Swastik");
			break;
		case "hij":
			System.out.println("Name of thr Student is : Venkat");
			break;
		default:
			System.out.println("invalid entry");

		}

	}

}
