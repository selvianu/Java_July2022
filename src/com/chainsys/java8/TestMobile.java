package com.chainsys.java8;

public class TestMobile {
	JUnitEx j = new JUnitEx();

	public String mobileValidation(String no) {
		j.setMobileNo(no);
		String mobileNo = j.getMobileNo();
		if (mobileNo.trim().length() == 10) {
			return mobileNo;
		} else
			return "invalid no";

	}
}
