package Numberlength;

public class Sumof_oddnum {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int sum= 0;
		{
		for (int b = 0; b <a.length; b++) {
			if(a[b]%2!=0)
			
			sum = sum + a[b];
		}
			System.out.println(sum);
		}
		

		}

	
}

