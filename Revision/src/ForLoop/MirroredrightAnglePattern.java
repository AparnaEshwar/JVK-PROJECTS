package ForLoop;

public class MirroredrightAnglePattern {
	public static void main(String [] args) {
		for (int row = 1; row <=4; row++) {
			for (int colum = 1; colum <=4; colum++) {
				if(row+colum<=4)
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