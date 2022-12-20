package ForLoop;

public class StarPrinting {
	public static void main(String [] args) {
		for (int row = 1; row <= 6; row++) { // outer loop for row count
			for (int column = 1; column <= row; column++) {// inner loop for column
				System.out.print("*");

			}

			System.out.println();
		}

	}
}
