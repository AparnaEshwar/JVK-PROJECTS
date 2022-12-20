package ForLoop;

public class LastIndexofWord {
	public static String lastIndex(String program) {
		String[] name=program.split(" ");
		String replaceof= "";
		int lastindexof=name.length-1;
		
		for (int i = 0; i < name.length; i++) {
			
			if(i==lastindexof)
			{
				String word=name[lastindexof];
			    char[] endindex = word.toCharArray();// changing the character from string 
			    String reverseword="";
			    for (int j = endindex.length-1; j>=0; j--) {// for loop condition for reversing the word from -1
			    	reverseword=reverseword+endindex[j];	
					
				}
			    
			   name[lastindexof]=reverseword;    
			    
			}
			replaceof=replaceof+name[i].concat(" ");
		}
		
		return replaceof;
	}


public static void main(String [] args)
{
	System.out.println(lastIndex("object Oriented Language"));
}
}