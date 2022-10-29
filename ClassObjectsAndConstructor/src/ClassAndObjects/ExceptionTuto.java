package ClassAndObjects;

public class ExceptionTuto {
	public void PrintNumber() {
		System.out.println("hai");
		try {
			System.out.println("Before Exception");
			int i = 10 / 0;
			System.out.println("After Exception");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("fim");
		}

	}

	public static void main(String[] args) {
		ExceptionTuto e = new ExceptionTuto();
		e.PrintNumber();
		System.out.println("Hello");

	}
}
