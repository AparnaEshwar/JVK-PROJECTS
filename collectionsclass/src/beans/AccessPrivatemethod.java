package beans;

import java.util.ArrayList;

import com.MavenMiniProject.StudentSemester.Student;

public class AccessPrivatemethod {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		Student s1 = new Student(1, "Aparna");
		Student s2 = new Student(2, "venkatesh");
		Student s3 = new Student(3, "Swastik");
		Student s4 = new Student(4, "Apoorva");

		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		for (Student std : student) {
			if (std.getName().startsWith("A")) {
				System.out.println(std.getId() + " " + std.getName());
			}

		}

	}

}
