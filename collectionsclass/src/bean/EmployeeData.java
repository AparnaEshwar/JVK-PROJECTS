package bean;

public class EmployeeData{

	
		private int employeeid;
		private String employeename;
		private int salary;
		
	public EmployeeData(int employeeid, String employeename, int salary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//public void remove(int employeeid2) {
		//this.employeeid=employeeid2;
			
	}
	
	
	


