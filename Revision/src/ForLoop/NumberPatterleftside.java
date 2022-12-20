package ForLoop;

public class NumberPatterleftside {
	public static void main(String args[]) {
		int line = 10;
		for (int row = 1; row <= line; row++) {
			for (int column = 1; column <= line - row; column++) {
				System.out.println(column);

				for (int k = 1; k <= row; k++) {
					System.out.println("");

				}
				System.out.println();
			}

		}
	}
}