package cys.training.day2;

import java.util.Scanner;

public class StudentDetails {

	/*
	 * method : accessspecifier returntype methodname() {
	 * 
	 * }
	 */
	public String name;

	public void getUserDetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of students");
		int numberOfStudents = s.nextInt();
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter Student name");

			name = s.next();
		}
		
		// System.out.println(name);

	}

	public String displayUserDetails() {
		
		System.out.println("Displaying details" + name);
		return name;
		// System.out.println();
	}

	public int calculateMarks(int mark1, int mark2) {
		// System.out.println(mark1*mark2);
		return mark1 * mark2;

	}

}
