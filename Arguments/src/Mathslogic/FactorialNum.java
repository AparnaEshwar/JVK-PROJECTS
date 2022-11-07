package Mathslogic;

public class FactorialNum {
	public static int factorialnumber(int n) {
		if (n == 0)
			return 1;
		else
		return (n * factorialnumber(n - 1));

	}

public static void main(String args[]) {
	int i, fact=1;
	int number=4;
	fact=factorialnumber(number);
	System.out.println("Factorial of "+number+" is: "+fact);
	
}
}
