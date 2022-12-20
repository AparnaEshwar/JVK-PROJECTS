package collectionsclasses;

import java.util.ArrayList;
import java.util.List;

public class Studentdata {
	int id;
	String name;

	Studentdata(int id, String name)

	{
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		List<Studentdata> Studentlists = new ArrayList<Studentdata>();
		Studentdata s1 = new Studentdata( 01, "Aparna");
		Studentdata s2 = new Studentdata( 02, "Anamika");
		Studentdata s3 = new Studentdata( 03, "Avanthika");
		Studentdata s4 = new Studentdata( 04, "Barani");
		Studentdata s5 = new Studentdata( 05, "Bharathi");
		Studentdata s6 = new Studentdata( 06, "Apoorva");

		Studentlists.add(s1);
		Studentlists.add(s2);
		Studentlists.add(s3);
		Studentlists.add(s4);
		Studentlists.add(s5);
		Studentlists.add(s6);
		// System.out.println(s1.id+s1.name);
		for (Studentdata std : Studentlists) {
			if (std.name.startsWith("A")) {
				System.out.println(std.id+" " +std.name);
				

			}

		}

	}

}
