package ConditionOperators;

import java.util.Scanner;

public class AndOperator {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number :");
		int i= number.nextInt();
			if(i==10 && i<=20 )
			{
				System.out.println("The Given number is true !");
			}

		else
		{ 
			System.out.println("The Given number is false !");
		}
			
		
	
}
}
