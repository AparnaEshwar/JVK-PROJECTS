package methodspractice;

public class Lastindex {
	public static String lastIndex(String java) {
		String[] name = java.split(" ");
		String replaceword = "";
		int lastIndex = name.length - 1;

		for (int i = 0; i < name.length; i++) {

			if (i == lastIndex) {
				String word = name[lastIndex];
				char[] lastWordArray = word.toCharArray();

				String reverseWord = "";
				for (int n = lastWordArray.length - 1; n >= 0; n--) {
					reverseWord = reverseWord + lastWordArray[n];
				}
				name[lastIndex] = reverseWord;
			}

			replaceword = replaceword + name[i].concat(" ");
		}
	return replaceword;

	}

	public static void main(String[] args) {
		System.out.println(lastIndex("Object oriented language"));
	}
}