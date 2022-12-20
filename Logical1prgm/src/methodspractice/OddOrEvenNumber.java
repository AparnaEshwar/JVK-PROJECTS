package methodspractice;

import java.util.Scanner;


public class OddOrEvenNumber {
	public static boolean isEvenNumber(int[] array) {
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				return true;
			}
			
		}
		return false;
		
	}

	public static void main(String args[]) {
		Scanner count = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length=count.nextInt();//initializing the array as variable
		int[] array=new int[length];

		for (int i = 0; i < args.length; i++) {
			
			System.out.println("Enter the"+i+"th numbers");
			int numbers=count.nextInt();
			array[i] = numbers;
		}	
        boolean isEvenOrOdd=isEvenNumber(array);
        if(isEvenOrOdd) {
        	System.out.println("The number is even");
        }
        else
        {
        	System.out.println("The number is odd");
        }
		}
	}

