package com.chainsys.java8.junit;

public class Check {
	public static String display(String name) {
		if (name.length() < 5)
			return "enter valid name";
		else
			return name;
	}
}
