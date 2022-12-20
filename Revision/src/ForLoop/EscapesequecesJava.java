package ForLoop;

public class EscapesequecesJava {
	public static void main(String[] args) {
		String temp = "";
		String msg = "maruti skoda \"Tata is indian company\" mg volkswagon";
		String array[] = new String[6];
		int arrayIndex = 0;
		int doublequotescount = 0;
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == '"') {
				temp = temp + msg.charAt(i);
				doublequotescount++;

			} else if (doublequotescount % 2 == 0 && msg.charAt(i) == ' ') {
				array[arrayIndex++] = temp;
				temp = "";
				// arrayIndex=msg.charAt(i);
			} else {  
				
				temp = temp + msg.charAt(i);
			}
		}
		array[arrayIndex] = temp;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
