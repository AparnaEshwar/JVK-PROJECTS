package Numberlength;

import java.util.Scanner;

public class assighnentofarry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int firstArraySize = sc.nextInt();
		int secondDimensionSize = sc.nextInt();

		int[][] count = new int[firstArraySize][secondDimensionSize];
		System.out.println("Enter the array values");
		int secondDimensionSize1 = sc.nextInt();
		double[][] a = new double[firstArraySize][secondDimensionSize1];
		if (firstArraySize <= secondDimensionSize1) {

			for (int j = 0; j < a.length; j++) {
				for (int i = a.length - 1; i > 0; i--) {
					if (i >= j) {
						{
							System.out.println("Enter the reverse array number");

							System.out.println(a[i][j]);
						}
					}
				}

			}

		}
	}
}
