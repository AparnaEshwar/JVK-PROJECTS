package Condition_String;

import java.util.Scanner;

public class String_Opt {
	public static void main (String[]args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the Name:");
	String name = sc.nextLine();
	
	if(name.equals("Venkatesh"))
	{
		System.out.println("The Given name is"+ name);
	
	}
	
	else if(name.equals("Aparna"))
	{
		System.out.println("The Given name is "+name);
		
	}
	
	else
	{
		System.out.println("invalid name");
	}
	}
	

}
