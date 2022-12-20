package methodspractice;

import java.util.Scanner;

public class AdditionOfNumbers {
	public static int additionOfNum(int i, int j) {
		int add = 0;
		add = i + j;
		return add;
	}

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = scanner.nextInt();
		int sum = additionOfNum(num1, num2);//method calling
		System.out.println(sum);
	}
}
