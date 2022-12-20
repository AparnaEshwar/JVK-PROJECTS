package methodspractice;

public class EndIndexSentence {
	public static String endIndex(String word) {
		String[] name= word.split(" ");// string splitting 
		 String reversename = "";
		 for(int n=0; n<name.length; n++) {
			 int getname= name.length-1;
			 if(n==getname) {
			 String string=name[getname]; 
			 char[]chrs = string.toCharArray();
			 String reverseword="";
			 for(int i=chrs.length-1; i>=0; i--) {
				 reverseword=reverseword+chrs[i];
				  
			 }name[getname]=reverseword;
			 }
			      reversename=reversename+name[n].concat(" ");
			 }
	   return reversename;
}
	public static void main(String[] args) {
		System.out.println(endIndex("Happy new year")); 
	}
	}