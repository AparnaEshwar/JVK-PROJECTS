package Mathslogic;

public class FactorialProgramming {

	public static int factorial(int i) {
		 if (i == 0)    
			    return 1;    
			  else    
			    return(i * factorial(i-1));    
			 }    
			 public static void main(String args[]){  
			  int i,fact=1;  
			  int number=4;
			  fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 } 
			
}
