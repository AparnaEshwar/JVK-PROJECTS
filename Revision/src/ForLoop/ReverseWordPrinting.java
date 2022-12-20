package ForLoop;

public class ReverseWordPrinting {
	public static void main(String [] args) {
		String name=" Automative Engg Technologies";
		String[] array= name.split(" ");// splitting the words 
		
		for (int i = 0; i < array.length; i++) { // counting the array from 0 to n
			
			String element=array[i];// assigning array to new string variable 
			for (int j=element.length()-1;j>=0; j--) { // counting the length of the element after assigning 
				System.out.print(element.charAt(j));	// changing string to char and print 
				
			}
			System.out.print(" ");// space for each word
		}
	}

}
