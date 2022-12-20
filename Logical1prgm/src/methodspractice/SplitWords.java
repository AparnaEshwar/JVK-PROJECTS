package methodspractice;

public class SplitWords {
	public static String splitSentence(String word) {
		 String[] name= word.split(" ");// string splitting 
		 String reversename = " ";
		 for(int n=0; n<name.length; n++)
		 {
			String getmethod=ReverseCharacterinArray.characterReverseAraay(name[n]);//reverse method calling from another class
			reversename=reversename+getmethod;
		 }

	 return reversename;

}
public static void main(String[] args) {
	String str= splitSentence("Oject Oriented language");//method calling
	 str =str.concat(" ");
	
	System.out.println(str);
}
	
}
