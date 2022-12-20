package ForLoop;

public class PrintingReverseWord {
	public static void main(String[] args) {
		String name= " Sharadha vilas";
		String[] array=name.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			String element=array[i];
			for (int j = element.length()-1; j>=0; j--) {
				System.out.print(element.charAt(j));	
			}
			 System.out.println(" ");
		}
	}

}
