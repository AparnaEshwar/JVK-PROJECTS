package Exceptiondemo;

public class TryCatchPractice {
	public void Printname()
	{
		System.out.println("HAI");
	
try
{
	System.out.println("beforeException");
     int i=10/0;
     System.out.println("After Exception");

}
	finally {
		System.out.println("finallly method");
	}
	}
	public static void main(String[] args) {
		TryCatchPractice e= new TryCatchPractice();
		e.Printname();
		

	}
}