package ReadlineBufferreader;

public class StrigstoIntegerUsingMethods {
	public static String name(String java, int j) {
		String str = "2000";
		int n = 22;
		int m = Integer.valueOf(str);// changing from string to integer
		int sum = (n + m);

		String value = Integer.toString(sum);
		return value;
	}

	public static void main(String args[]) {
		String number = new String("1000");
		System.out.println(name("file", 10));
	}

}