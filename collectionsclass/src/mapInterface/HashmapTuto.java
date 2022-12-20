package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapTuto {
	public static void main(String[] args) {

		Map<Integer, String> Customer = new HashMap<>();
		{
			Customer.put(01, "Aparna");
			Customer.put(02, "Venkatesh");
			Customer.put(03, "Swastik");
			Customer.put(01, "aparna");
			Customer.put(02, "kavyan");
			for (Entry<Integer, String> customer : Customer.entrySet()) {
				System.out.println(customer.getKey() + customer.getValue());

			}

		}
	}
}
