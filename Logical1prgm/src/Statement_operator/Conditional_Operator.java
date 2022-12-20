package Statement_operator;

import java.util.Scanner;

public class Conditional_Operator {
	public static void main(String[] args) {

		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			int i = scanner.nextInt();
			if (i == 10 || i <= 20) {
				System.out.println("true");
			}

			else {
				System.out.println("false");
			}

		}
	}
}
