package com.chainsys.java8.junit;

public class Addition {

	public static int add(int a , int b) {
		return a+b;
	}
	
	public static String getFullName(String a , String b) {
		return a + " "+b;
	}
	
	public static int getCabFare(String cabType, int noOfKms) {
		int fare = 0;
		if(cabType.equalsIgnoreCase("micro")) {
			fare = 10* noOfKms;
		}
		else if(cabType.equalsIgnoreCase("mini")) {
			fare = 15* noOfKms;
		}
		return fare;
	}
}
