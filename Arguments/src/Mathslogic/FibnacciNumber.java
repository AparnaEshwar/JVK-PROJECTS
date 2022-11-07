package Mathslogic;

public class FibnacciNumber {
	public static void fibnaccinumber() {
		int num1 = 0, num2 = 1, count = 10, sum;

		for (int n = 0; n <= count; n++) {
			System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2=sum;
		}

	}

	public static void main(String args[]) {
		fibnaccinumber();
	}
}