package ForLoop;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5, sum;
		sum = a % b;
		for (int i = 0; i <=2;i++) {
			if (sum % 2 == 0) {
				System.out.println("Entered Value is even Number");
				break;
			} else
				System.out.println("Entered Value is odd number");
		}

	}

}
