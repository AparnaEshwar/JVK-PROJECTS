package bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
	ArrayList<EmployeeData> Employee = new ArrayList<>();

	public void addEmployeeList(EmployeeData emp) {
		Employee.add(emp);

	}

	public void removeEmployeelist(int Employeeid, String Employeename) {
		for (Iterator iterator2 = Employee.iterator(); iterator2.hasNext();) {
			EmployeeData employeeData2 = (EmployeeData) iterator2.next();
			if ((employeeData2.getEmployeeid() == Employeeid) || (employeeData2.getEmployeename().equals(Employeename)))

				iterator2.remove();
		}
	}

	public void showemployee() {
		for (EmployeeData empd : Employee) {
			System.out.println(empd.getEmployeeid() + empd.getEmployeename() + empd.getSalary());
		}

	}

	public void searchEmployeename(String employeename) {
		for (EmployeeData employeeData : Employee) {
			if (employeeData.getEmployeename().equals(employeename)) {
				System.out.println(employeeData.getEmployeename());
				System.out.println(employeeData.getEmployeeid() + " " + employeeData.getSalary());
			}
		}

	}

	public static void main(String[] args) {
		EmployeeList emplis = new EmployeeList();
		EmployeeData ed1 = new EmployeeData(1, "venkatesh", 250000);
		EmployeeData ed2 = new EmployeeData(2, "Eshwar", 350000);
		EmployeeData ed3 = new EmployeeData(3, "Swastik", 380000);
		EmployeeData ed4 = new EmployeeData(4, "Aparna", 150000);

		emplis.addEmployeeList(ed1);
		emplis.addEmployeeList(ed2);
		emplis.addEmployeeList(ed3);
		emplis.addEmployeeList(ed4);
		emplis.showemployee();

		emplis.removeEmployeelist(1, "venkatesh");
		System.out.println();
		emplis.showemployee();
		emplis.searchEmployeename("Aparna");
	}

}
