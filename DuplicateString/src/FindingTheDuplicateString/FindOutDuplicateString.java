package FindingTheDuplicateString;

public class FindOutDuplicateString {
	public static char findrepeatedword(String str) {
		char[] name = str.toCharArray();
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (name[i] == name[j]) {
					return name[i];
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(findrepeatedword("GoGreen"));
	}

}
