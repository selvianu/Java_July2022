package com.chainsys.fileoperations;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + "lastName=" + lastName + "]";
	}

}
