package cys.training.day2.test;

import cys.training.day2.StudentDetails;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails s = new StudentDetails();
		s.getUserDetails();
		String displayUserDetails = s.displayUserDetails();

		int calculateMarks = s.calculateMarks(30, 50);
		System.out.println(calculateMarks);
	}

}
