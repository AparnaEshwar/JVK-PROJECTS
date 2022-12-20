package Condition_for;

public class Dowhile_sum {
	public static void main(String[] args) {
		int num = 10;
		int sum = 0;
		do {
			sum = sum + num;
			num += 2;
		} while (num <= 20);
		System.out.println(sum);

	}

}
