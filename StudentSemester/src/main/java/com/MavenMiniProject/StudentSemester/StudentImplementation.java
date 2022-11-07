package com.MavenMiniProject.StudentSemester;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation {

	public static void main(String[] args) {
		StudentImplementation stdimp = new StudentImplementation();
		List<Student> studentdetails = stdimp.getpreapareddata();
		System.out.println(studentdetails);

		System.out.println("passedStudents");
		//stdimp.printData(stdimp.passedStudent(studentdetails));
		//System.out.println("Failed Students");
		//stdimp.printData(stdimp.getFailedStudents(studentdetails));
		System.out.println("Result calculation");
		stdimp.printData(stdimp.resultcalculation(studentdetails));
		System.out.println("Highest calculation");
		stdimp.printData(stdimp.Hightestmarksfromthedept(studentdetails));

	}

	public void printData(List<Student> studentList) {
		for (Student std : studentList) {
			System.out.println(std);
		}
	}

	public List<Student> passedStudent(List<Student> sub2) {
		List<Student> result = new ArrayList<Student>();
		for (Student std2 : sub2) {
			if (std2.isIspassed()) {
				result.add(std2);

			}

		}
		return sub2;
	}

	public List<Student> getFailedStudents(List<Student> sub2) {
		List<Student> result = new ArrayList<Student>();
		for (Student std2 : sub2) {
			if (!std2.isIspassed()) {
				result.add(std2);

			}

		}
		return sub2;
	}

	public List<Student> resultcalculation(List<Student> studentList) {
		List<Student> students = new ArrayList<Student>();
		for (Student student : studentList) {
			int total = 0;
			for (Subject subject : student.getSubjects()) {
				total = total + subject.getMarks();

			}
			student.setTotal(total);
			students.add(student);

		}

		return studentList;

	}

	public List<Student> Hightestmarksfromthedept(List<Student> studentList) {
		List<Student> students = new ArrayList<Student>();
		int highestscore = 0;

		for (Student studentData : studentList) {

			if (studentData.getTotal() > highestscore) {
				highestscore = studentData.getTotal();
				students.add(studentData);
			}
		}
		return studentList;

	}

	private List<Student> getpreapareddata() {
		ArrayList<Subject> student1subject = new ArrayList<>();
		Subject s1 = new Subject(1, "Data Structure", 56, 1);
		Subject s2 = new Subject(2, "Maths1", 63, 1);
		Subject s3 = new Subject(3, "Embeded System", 63, 1);
		Subject s4 = new Subject(4, "Maths2", 75, 1);
		Subject s5 = new Subject(5, "DSP", 72, 1);

		student1subject.add(s1);
		student1subject.add(s2);
		student1subject.add(s3);
		student1subject.add(s4);
		student1subject.add(s5);

		ArrayList<Subject> student2subject = new ArrayList<>();
		Subject s6 = new Subject(6, "MicroProcessor", 90, 1);
		Subject s7 = new Subject(7, "E&I", 56, 1);
		Subject s8 = new Subject(8, "Java Programming", 90, 1);
		Subject s9 = new Subject(9, "ALP", 7, 1);
		Subject s10 = new Subject(10, "DBMS", 87, 1);

		student2subject.add(s6);
		student2subject.add(s7);
		student2subject.add(s8);
		student2subject.add(s9);
		student2subject.add(s10);

		ArrayList<Subject> student3subject = new ArrayList<>();
		Subject s11 = new Subject(6, "MicroProcessor", 65, 1);
		Subject s12 = new Subject(7, "E&I", 73, 1);
		Subject s13 = new Subject(8, "Java Programming", 76, 1);
		Subject s14 = new Subject(9, "ALP", 98, 1);
		Subject s15 = new Subject(10, "DBMS", 97, 1);

		student3subject.add(s11);
		student3subject.add(s12);
		student3subject.add(s13);
		student3subject.add(s14);
		student3subject.add(s15);

		ArrayList<Subject> student4subject = new ArrayList<>();
		Subject s16 = new Subject(6, "MicroProcessor", 81, 1);
		Subject s17 = new Subject(7, "E&I", 81, 1);
		Subject s18 = new Subject(8, "Java Programming", 45, 1);
		Subject s19 = new Subject(9, "ALP", 67, 1);
		Subject s20 = new Subject(10, "DBMS", 87, 1);

		student4subject.add(s16);
		student4subject.add(s17);
		student4subject.add(s18);
		student4subject.add(s19);
		student4subject.add(s20);

		ArrayList<Subject> student5subject = new ArrayList<>();
		Subject s21 = new Subject(6, "MicroProcessor", 50, 1);
		Subject s22 = new Subject(7, "E&I", 87, 1);
		Subject s23 = new Subject(8, "Java Programming", 87, 1);
		Subject s24 = new Subject(9, "ALP", 45, 1);
		Subject s25 = new Subject(10, "DBMS", 50, 1);

		student5subject.add(s21);
		student5subject.add(s22);
		student5subject.add(s23);
		student5subject.add(s24);
		student5subject.add(s25);

		ArrayList<Student> studentList = new ArrayList<>();
		Student st1 = new Student(101, "Priya", "CSE", student1subject);
		Student st2 = new Student(102, "Uma", "EEE", student2subject);
		Student st3 = new Student(103, "Jaya", "ECE", student3subject);
		Student st4 = new Student(104, "Gowtham", "MECH", student4subject);
		Student st5 = new Student(105, "SONI", "I&T", student5subject);
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);
		studentList.add(st5);

		return studentList;
	}

}
