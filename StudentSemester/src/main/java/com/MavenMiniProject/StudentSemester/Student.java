package com.MavenMiniProject.StudentSemester;

import java.util.ArrayList;


public class Student {
	private int stdid;
	private String name;
	private String Dept;
	private int rank;
    private int total;
	private boolean ispassed;
	
	private ArrayList<Subject> subjects;

	public Student(int stdid, String name, String dept, ArrayList<Subject> student1subject) {
		super();
		this.stdid = stdid;
		this.name = name;
		Dept = dept;
		this.subjects = student1subject;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isIspassed() {
		return ispassed;
	}

	public void setIspassed(boolean ispassed) {
		this.ispassed = ispassed;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", Dept=" + Dept + ", rank=" + rank + ", total=" + total
				+ ", ispassed=" + ispassed + ", subjects=" + subjects + "]";
	}
	
}