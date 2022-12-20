package MyPracticeSession;

public class PrintStringAndReverse {
	public static void main(String[] args) {
		String name = "Object Oriented Language";
		String[] splitingbySpace = name.split(" ");
		// System.out.println(splitingbySpace[0]);
		// System.out.println(splitingbySpace[1]);
		// System.out.println(splitingbySpace[2]);
		for (int j = 0; j < name.length(); j++) {
			System.out.println(name.charAt(j));
		}
		System.out.println("-----------------");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

	}

}
