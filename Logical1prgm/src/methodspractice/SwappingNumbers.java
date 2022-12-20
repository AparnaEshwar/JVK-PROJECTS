package methodspractice;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number1 : ");
		int value1= scanner.nextInt();
		System.out.println("Enter the Numer2 :");
	    int value2= scanner.nextInt();
	    int temp=value1;
	    value1=value2;
	    value2=temp;
	    
	    System.out.println("value1="+value1);
	    System.out.println("value2="+value2);
	}

}
