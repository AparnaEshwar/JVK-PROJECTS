package methodspractice;

public class addsumnumbers {
	public int addnumbers(int a, int b) {
		int addition = a + b;
		return addition;
	}	

	public static void main(String[] args) {
		int c = 13;
		int d = 15;
		addsumnumbers obj = new addsumnumbers();
		int sum = obj.addnumbers(c, d);
		System.out.println("total value a+b:" + sum);

	}

}
