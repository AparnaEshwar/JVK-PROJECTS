package Condition_for;

public class SerialviceNum {
	public static void main(String[] args) {
		int count = 1;
		int rows = 5;

		for (int num = 1; num <= rows; num++) {
			for (int numi = 1; numi <= num; numi++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();

		}
	}
}