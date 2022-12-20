package MyPracticeSession;

public class NumDivisibleByTwoUsingForLoop {

	public static void main(String[] args) {

		int[] num = { 1,10, 12, 15, 14, 5, 20, 65, 40 };
		{

			for (int j = 0; j < num.length; j++) {
				if (num[j] % 2 == 0) {
					System.out.println(num[j]);
					break;
				} else {
					System.out.println(num[j] + ": is not divisible by 2 ");
				}
			}
		}

	}
}
