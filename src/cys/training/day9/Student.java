package cys.training.day9;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {

		ArrayList<Integer> studentList = new ArrayList<Integer>();
		studentList.add(101);
		studentList.add(300);
		System.out.println(studentList);

		ArrayList<CollegeStudent> collegeStudent = new ArrayList<>();
		CollegeStudent stud1 = new CollegeStudent("Anu", 5678987l);
		collegeStudent.add(stud1);
		System.out.println(collegeStudent);

	}

}
