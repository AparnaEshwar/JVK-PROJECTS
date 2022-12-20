package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class NaukriList {
	ArrayList<NaukriData> naukri = new ArrayList<>();

	public void addnaukrilist(NaukriData emp) {
		naukri.add(emp);
	}

	public void removenaukrilist(int id, String name) {
		for (Iterator<NaukriData> iterator = naukri.iterator(); iterator.hasNext();) {
			NaukriData naukriData = (NaukriData) iterator.next();
			if ((naukriData.getEmpid() == id) || (naukriData.getEmpname().equals(name)))
				iterator.remove();
		}

	}

	public void shownaukrilist() {
		for (NaukriData nd : naukri) {
			System.out.println(nd.empid + " " + nd.empname + " " + nd.empsalary);

		}
	}

	public void searchnaukrilist(String name) {
		for (NaukriData strname : naukri) {
			if (strname.getEmpname().equals(name)) {
				System.out.println(strname.getEmpid() + " " + strname.getEmpname() + " " + strname.getEmpsalary());
			}

		}
	}
	public NaukriData gethighestsalary() {
		int maxsalary=0;
		NaukriData salary= null;
		for (NaukriData gs : naukri) {
			if (gs.getEmpsalary()>maxsalary) {
				maxsalary=gs.empsalary;
				salary=gs;
					
				}
				
			}
			
		return salary;
	}
	

	public static void main(String[] args) {
		NaukriList list = new NaukriList();
		NaukriData na1 = new NaukriData(01, "Swastik", 15000);
		NaukriData na2 = new NaukriData(02, "Venkatesh",25000);
		NaukriData na3 = new NaukriData(03, "aparna", 15000);
		NaukriData na4 = new NaukriData(04, "Sobha", 15000);

		list.addnaukrilist(na1);
		list.addnaukrilist(na2);
		list.addnaukrilist(na3);
		list.addnaukrilist(na4);
		list.shownaukrilist();

		list.removenaukrilist(04,"Sobha");
		System.out.println();
		list.shownaukrilist();
		list.searchnaukrilist("Swastik");
		System.out.println();
		System.out.println(list.gethighestsalary().empname+ " "+list.gethighestsalary().empid+ " "+ list.gethighestsalary().empsalary);

	}

}
