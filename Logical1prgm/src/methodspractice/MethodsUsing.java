package methodspractice;

public class MethodsUsing {
	public static String reverseString (String Aparna) {
		char[] name=Aparna.toCharArray();
		String reversename= "";
		for(int n=name.length-1; n>=0; n--)
		{
			reversename=reversename+name[n];
		}
			
		return reversename;
		}
	public static void main(String[] args) {
		String n = reverseString("JAVA PROGRAM");//method calling
		System.out.println(n);
	}
	

}
