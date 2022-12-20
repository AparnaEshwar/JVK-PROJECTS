package methodspractice;

import java.util.Scanner;

public class Printstarbyuserinput {
	public static void printstars(int noOfStar)
		{
		for (int i = 0; i <= noOfStar; i++) {
			for (int j = 0; j < i; j++) {
                System.out.print("*");
			}
		System.out.println();
	}
		}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of star which you want to print");
		int countrow = scanner.nextInt();
		printstars(countrow);
	}

}
