package ConditionOperators;

import java.util.Scanner;

public class OrOperator {
	public static void main(String [] args) {
		Scanner number= new Scanner(System.in);
		System.out.println("enter the Number : ");
		int i = number.nextInt();
		if(i%2==0 || i==1)
		{
			System.out.println("The Value is True!");
		}
		else
		{
			System.out.println("The Value is False!");
		}
	}
	

}
