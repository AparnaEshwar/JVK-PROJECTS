package methodspractice;

import java.util.Arrays;

public class ArrrayNumMethod {
	public static int arrayValue(int[] myArray) {
		int greaterValue = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > greaterValue) {
				greaterValue = myArray[i];
			}
		}
		return (greaterValue);
	}

	{

	public static void main(String[] args) {
		int[] myArray = { 50, 20, 30, 45, 89, 102, 14 };
		System.out.println("INPUT ARRAY : " + Arrays.toString(myArray));
		int maxvalueobj = new maxvalue();
		System.out.println("the maxixmum value of given Array is:" + obj.arrayValue(myArray));

	}

}