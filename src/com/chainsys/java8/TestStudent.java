package com.chainsys.java8;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new StudentImpl();
		s.save(4,6);
		s.update();
		Student.delete();

	}

}
