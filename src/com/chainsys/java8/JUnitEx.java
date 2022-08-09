package com.chainsys.java8;

public class JUnitEx {
	public static int add(int a, int b) {
		return a + b;
	}

	public static String display(String name) {
		if (name.length() < 5)
			return "invalid name";
		else
			return name;
	}

	public static boolean displayName(String name) {
		if (name.length() < 5)
			return false;
		else
			return true;
	}

	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
