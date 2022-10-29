package ClassAndObjects;

public class MobileDetails {
	String Mobilename;
	String Colour;
	int ram;
	String Size;
	int price;

	public MobileDetails()// Default Constructor
	{
		System.out.println();
	}

	public MobileDetails(String Mobilename, String Colour, int price)// parameterized Constructor
	{
		this.Mobilename = Mobilename;
		this.Colour = Colour;
		this.price = price;
	}

	public void Mobilerate(int Rs) {
		
		System.out.println("012");
	}

	public static void main(String[] args) {
		MobileDetails M1 = new MobileDetails();
		System.out.println(M1.Mobilename);
		MobileDetails M2 = new MobileDetails("Apple", "White", 48000);
		System.out.println(M2.Mobilename);
		System.out.println(M2.Colour);
		System.out.println(M2.price);
	}

}
