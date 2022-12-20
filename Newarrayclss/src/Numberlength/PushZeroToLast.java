package Numberlength;

public class PushZeroToLast {
	public static int[] pushingZerotoLast(int[] array, int length) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0)
				array[count++] = array[i];
		}
		while (count < length) {
			array[count++] = 0;
		}
		
		return array;
	}

	public static void main(String[] args) {
		int input[] = { 10, 2, 5, 6, 0, 0, 48, 0, 0, 0 };
		int output[] = pushingZerotoLast(input, 10);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

}
