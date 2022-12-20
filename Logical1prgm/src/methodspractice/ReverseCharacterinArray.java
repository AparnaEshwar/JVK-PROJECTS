package methodspractice;

public class ReverseCharacterinArray {
	public static String characterReverseAraay(String Testing) {
		char[] name= Testing.toCharArray();
		String reversename= (" ");
		for(int n=name.length-1; n>=0; n--)
		{
				reversename=reversename+name[n];
	}
           return reversename;
}
public static void main(String [] args) {
	String str= characterReverseAraay("Eco Space");//method calling
	System.out.println(str);
}
}