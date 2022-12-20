package Numberlength;

public class PushZero {
	public static int[] pushZero(int[] pushZero, int length) {
		int count = 0;
		for (int i = 0; i <pushZero.length; i++) {
			if (pushZero[i] != 0) {
				pushZero[count++] = pushZero[i];
		}
	}
			while (count < length) {

				pushZero[count++] = 0;

		}
		return pushZero;
	}

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4, 56, 10, 0, 0, 0, 12 };
		int output[] = pushZero(input, 10);
		for (int i = 0; i <output.length; i++) {
				System.out.println(output[i]);
			}
		}

	}
