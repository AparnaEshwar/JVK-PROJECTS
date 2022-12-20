package MyPracticeSession;

public class ReverseString {
	public static void main(String[] args) {
		String input= "selenium web developer";
		char[] str= input.toCharArray();
		for (int i =str.length-1; i>=0;i--) {
			System.out.print(str[i]);
			
		}
		
	}

}
