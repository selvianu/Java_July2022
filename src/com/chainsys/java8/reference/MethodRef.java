package com.chainsys.java8.reference;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<String> selectedNames = new ArrayList<String>();
		names.add("Lenovo");
		names.add("Bike");
		// A method reference - used to refer a method without invoking it
		// method reference
		System.out.println();
		System.out.println("Using method reference");
		names.forEach(System.out::println);
		
System.out.println("Using method reference by adding to another list");
		names.forEach(selectedNames::add);
		
		selectedNames.forEach(System.out::println);

	}

}
