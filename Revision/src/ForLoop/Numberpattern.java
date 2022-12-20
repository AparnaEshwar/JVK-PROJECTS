package ForLoop;

public class Numberpattern {// right side printing pattern
	public static void main(String[] args) {
		int line=5;
		for (int row = 1; row <=line; row++) {//outer loop should always row count
			for (int colum = 1; colum <=row; colum++) {//inner loop should always column count //(row=column)
				System.out.print(colum);// call the column to print the number or if we want to print star "*" instead od column.
				
			}
			System.out.println();// next line 
		}
	}

}
