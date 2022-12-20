package Condition_for;

import java.util.Scanner;

public class Starprint_forloop {
	
	
	public static void printStart(int noOfRows)
	{
		for (int num = 0; num <= noOfRows; num++) {
			for (int numi = 0; numi < num; numi++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls give no of rows :");
		int rowCount = scanner.nextInt();
		
		printStart(rowCount);
	}
}
