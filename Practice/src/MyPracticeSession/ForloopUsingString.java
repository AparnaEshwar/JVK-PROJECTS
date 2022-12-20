package MyPracticeSession;

public class ForloopUsingString {
	public static void main(String[] args) {
		String[] name = { "Aparna", "Venkat", "Swastik" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}
		for (String n : name) {

			System.out.println(n);

		}

	}

	
}