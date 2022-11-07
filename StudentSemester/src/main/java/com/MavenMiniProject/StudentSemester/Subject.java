package com.MavenMiniProject.StudentSemester;

public class Subject {
	private int subjectcode;
	private String subjectname;
	private int marks;
	private int semester;

	public Subject(int subjectcode, String subjectname, int marks, int semester) {
		super();
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
		this.marks = marks;
		this.semester = semester;
	}

	public int getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Subject [subjectcode=" + subjectcode + ", subjectname=" + subjectname + ", marks=" + marks
				+ ", semester=" + semester + "]";
	}
	

}
