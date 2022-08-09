package com.chainsys.java8;

public class StudentLambda {

	public static void main(String[] args) {

		Student s = (n, m) -> System.out.println("Saving the student records using lambda." + (n + m));
		s.save(5, 6);
	}

}
