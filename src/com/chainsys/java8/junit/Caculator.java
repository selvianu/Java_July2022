package com.chainsys.java8.junit;

public class Caculator {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int product(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int greaterNumber(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static String getFullName(String a, String b) {
		return a + " " + b;
	}

	public static boolean getFullName(String a) {
		if (a.length() > 5)
			return true;
		else
			return false;

	}

	public static int getCabFare(String cabType, int noOfKms) {
		int fare = 0;
		if (cabType.equalsIgnoreCase("micro")) {
			fare = 10 * noOfKms;
		} else if (cabType.equalsIgnoreCase("mini")) {
			fare = 15 * noOfKms;
		}
		return fare;
	}

	private double basicSalary;

	public void setBasicSalary(double basicSalary) {
		if (basicSalary < 0) {
			throw new IllegalArgumentException("Negative salary is invalid.");
		}
		this.basicSalary = basicSalary;
	}

	public double getGrossSalary() {
		return this.basicSalary + getSocialInsurance() + getAdditionalBonus();
	}

	public double getSocialInsurance() {
		return this.basicSalary * 25 / 100;
	}

	public double getAdditionalBonus() {
		return this.basicSalary / 10;
	}

	public static boolean equalIntegers(int i, int j) {
		return false;
	}

}
