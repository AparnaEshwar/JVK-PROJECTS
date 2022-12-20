package ForLoop;

public class StarPatternHalfdiamond {
	public static void main(String[] args) {
		int n = 5;
		for (int row = 0; row < 2 * n; row++) {
			int countcolumsinrow = row > n ? 2 * n-row : row;
			for (int colum = 0; colum < countcolumsinrow; colum++) {
				System.out.println("* ");

			}

			System.out.println();
		}
	}

}
