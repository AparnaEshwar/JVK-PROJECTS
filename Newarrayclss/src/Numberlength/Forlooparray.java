package Numberlength;

public class Forlooparray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		{
			System.out.println(a.length);
			System.out.println(a[2]);
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		{
			System.out.println(sum);
		}

	}
}
