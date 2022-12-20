package ForLoop;

public class PyramidPattern {
	public static void main(String[] args) {
		for (int row = 1; row <=5; row++) {
			for (int colum = 1; colum <=5+row-1; colum++) {
				if(row+colum<=5)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
