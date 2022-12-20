package methodspractice;

import java.util.Scanner;

public class usingarrayinmethod {

	public static boolean isStudentPassed(int[] studentMarks, int passMark) {

		for (int i = 0; i < studentMarks.length; i++) {
			if (studentMarks[i] < passMark) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please eneter no of subjects");
		int noOFSubjects = scanner.nextInt();
		int[] marks = new int[noOFSubjects];

		for (int i = 0; i < marks.length; i++) {

			System.out.println("please enter " + i + " subject mark :");
			int mark = scanner.nextInt();
			marks[i] = mark;
		}

		int passmark = 20;

		boolean studentPassed = isStudentPassed(marks, passmark);

		if (studentPassed) { 
			System.out.println("student passed");
		} else {
			System.out.println("student failed");
		}
	}
}

