package ClassAndObjects;

import java.util.Scanner;

public class StudentsData {
	String Studentname;
	int rollno;
	String Subjects;
	int[] marks;
	int total;
	boolean isPass = false;// boolean used

	public StudentsData() {
		System.out.println();
	}

	public StudentsData(String Studentname, int rollno, String Subjects, int[] marks, int total) {
		this.Studentname = Studentname;
		this.rollno = rollno;
		this.Subjects = Subjects;
		this.marks = marks;
		this.total = total;
	}

	public StudentsData(int[] marks) {
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] > 35) {
				isPass = true;
			}
		}
	}

	public static void main(String[] args) {
		Scanner Score = new Scanner(System.in);
		System.out.println("Enter the Roll no");
		int Result = Score.nextInt();
		int[] marks = { 35, 40, 86, 24, 65 };
		StudentsData sd1 = new StudentsData();
		System.out.println(sd1.Studentname);
		StudentsData sd2 = new StudentsData("Aparna", 17334, "English", marks, 399);
		System.out.println(sd2.Studentname + " " + sd2.rollno + " " + sd2.Subjects + " " + sd2.total);
		if (sd2.isPass) {
			System.out.println("pass"); 
		} else {
			System.out.println("fail");
		}

	}
}
