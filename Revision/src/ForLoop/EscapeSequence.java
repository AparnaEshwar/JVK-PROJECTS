package ForLoop;

public class EscapeSequence {
	public static void main (String [] args) {
		String temp = "";
		String arr[] = new String[5];
		String sentence = "moon sun \"jupitor is largest plant\" pluto saturn";
		int arryIndex = 0;
		int doublequotescounter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == '"') {
				temp = temp + sentence.charAt(i);
				doublequotescounter++;

			} else if (doublequotescounter % 2 == 0 && sentence.charAt(i) == ' ') {
				arr[arryIndex++] = temp;
				temp = "";

			} else {
				temp = temp + sentence.charAt(i);

			}

		}
		arr[arryIndex] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}
}
